package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryIndirectInfoKHR.class */
public class VkCopyMemoryIndirectInfoKHR extends Struct<VkCopyMemoryIndirectInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SRCCOPYFLAGS;
    public static final int DSTCOPYFLAGS;
    public static final int COPYCOUNT;
    public static final int COPYADDRESSRANGE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(VkStridedDeviceAddressRangeKHR.SIZEOF, VkStridedDeviceAddressRangeKHR.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCCOPYFLAGS = layout.offsetof(2);
        DSTCOPYFLAGS = layout.offsetof(3);
        COPYCOUNT = layout.offsetof(4);
        COPYADDRESSRANGE = layout.offsetof(5);
    }

    protected VkCopyMemoryIndirectInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCopyMemoryIndirectInfoKHR create(long address, ByteBuffer container) {
        return new VkCopyMemoryIndirectInfoKHR(address, container);
    }

    public VkCopyMemoryIndirectInfoKHR(ByteBuffer container) {
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

    @NativeType("VkAddressCopyFlagsKHR")
    public int dstCopyFlags() {
        return ndstCopyFlags(address());
    }

    @NativeType("uint32_t")
    public int copyCount() {
        return ncopyCount(address());
    }

    public VkStridedDeviceAddressRangeKHR copyAddressRange() {
        return ncopyAddressRange(address());
    }

    public VkCopyMemoryIndirectInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCopyMemoryIndirectInfoKHR sType$Default() {
        return sType(KHRCopyMemoryIndirect.VK_STRUCTURE_TYPE_COPY_MEMORY_INDIRECT_INFO_KHR);
    }

    public VkCopyMemoryIndirectInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCopyMemoryIndirectInfoKHR srcCopyFlags(@NativeType("VkAddressCopyFlagsKHR") int value) {
        nsrcCopyFlags(address(), value);
        return this;
    }

    public VkCopyMemoryIndirectInfoKHR dstCopyFlags(@NativeType("VkAddressCopyFlagsKHR") int value) {
        ndstCopyFlags(address(), value);
        return this;
    }

    public VkCopyMemoryIndirectInfoKHR copyCount(@NativeType("uint32_t") int value) {
        ncopyCount(address(), value);
        return this;
    }

    public VkCopyMemoryIndirectInfoKHR copyAddressRange(VkStridedDeviceAddressRangeKHR value) {
        ncopyAddressRange(address(), value);
        return this;
    }

    public VkCopyMemoryIndirectInfoKHR copyAddressRange(Consumer<VkStridedDeviceAddressRangeKHR> consumer) {
        consumer.accept(copyAddressRange());
        return this;
    }

    public VkCopyMemoryIndirectInfoKHR set(int sType, long pNext, int srcCopyFlags, int dstCopyFlags, int copyCount, VkStridedDeviceAddressRangeKHR copyAddressRange) {
        sType(sType);
        pNext(pNext);
        srcCopyFlags(srcCopyFlags);
        dstCopyFlags(dstCopyFlags);
        copyCount(copyCount);
        copyAddressRange(copyAddressRange);
        return this;
    }

    public VkCopyMemoryIndirectInfoKHR set(VkCopyMemoryIndirectInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCopyMemoryIndirectInfoKHR malloc() {
        return new VkCopyMemoryIndirectInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCopyMemoryIndirectInfoKHR calloc() {
        return new VkCopyMemoryIndirectInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCopyMemoryIndirectInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyMemoryIndirectInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkCopyMemoryIndirectInfoKHR create(long address) {
        return new VkCopyMemoryIndirectInfoKHR(address, null);
    }

    public static VkCopyMemoryIndirectInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCopyMemoryIndirectInfoKHR(address, null);
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

    public static VkCopyMemoryIndirectInfoKHR malloc(MemoryStack stack) {
        return new VkCopyMemoryIndirectInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCopyMemoryIndirectInfoKHR calloc(MemoryStack stack) {
        return new VkCopyMemoryIndirectInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndstCopyFlags(long struct) {
        return MemoryUtil.memGetInt(struct + DSTCOPYFLAGS);
    }

    public static int ncopyCount(long struct) {
        return MemoryUtil.memGetInt(struct + COPYCOUNT);
    }

    public static VkStridedDeviceAddressRangeKHR ncopyAddressRange(long struct) {
        return VkStridedDeviceAddressRangeKHR.create(struct + COPYADDRESSRANGE);
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

    public static void ndstCopyFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + DSTCOPYFLAGS, value);
    }

    public static void ncopyCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + COPYCOUNT, value);
    }

    public static void ncopyAddressRange(long struct, VkStridedDeviceAddressRangeKHR value) {
        MemoryUtil.memCopy(value.address(), struct + COPYADDRESSRANGE, VkStridedDeviceAddressRangeKHR.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryIndirectInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkCopyMemoryIndirectInfoKHR, Buffer> implements NativeResource {
        private static final VkCopyMemoryIndirectInfoKHR ELEMENT_FACTORY = VkCopyMemoryIndirectInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCopyMemoryIndirectInfoKHR.SIZEOF);
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
        public VkCopyMemoryIndirectInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCopyMemoryIndirectInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCopyMemoryIndirectInfoKHR.npNext(address());
        }

        @NativeType("VkAddressCopyFlagsKHR")
        public int srcCopyFlags() {
            return VkCopyMemoryIndirectInfoKHR.nsrcCopyFlags(address());
        }

        @NativeType("VkAddressCopyFlagsKHR")
        public int dstCopyFlags() {
            return VkCopyMemoryIndirectInfoKHR.ndstCopyFlags(address());
        }

        @NativeType("uint32_t")
        public int copyCount() {
            return VkCopyMemoryIndirectInfoKHR.ncopyCount(address());
        }

        public VkStridedDeviceAddressRangeKHR copyAddressRange() {
            return VkCopyMemoryIndirectInfoKHR.ncopyAddressRange(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCopyMemoryIndirectInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRCopyMemoryIndirect.VK_STRUCTURE_TYPE_COPY_MEMORY_INDIRECT_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCopyMemoryIndirectInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer srcCopyFlags(@NativeType("VkAddressCopyFlagsKHR") int value) {
            VkCopyMemoryIndirectInfoKHR.nsrcCopyFlags(address(), value);
            return this;
        }

        public Buffer dstCopyFlags(@NativeType("VkAddressCopyFlagsKHR") int value) {
            VkCopyMemoryIndirectInfoKHR.ndstCopyFlags(address(), value);
            return this;
        }

        public Buffer copyCount(@NativeType("uint32_t") int value) {
            VkCopyMemoryIndirectInfoKHR.ncopyCount(address(), value);
            return this;
        }

        public Buffer copyAddressRange(VkStridedDeviceAddressRangeKHR value) {
            VkCopyMemoryIndirectInfoKHR.ncopyAddressRange(address(), value);
            return this;
        }

        public Buffer copyAddressRange(Consumer<VkStridedDeviceAddressRangeKHR> consumer) {
            consumer.accept(copyAddressRange());
            return this;
        }
    }
}
