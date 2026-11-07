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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindHeapInfoEXT.class */
public class VkBindHeapInfoEXT extends Struct<VkBindHeapInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int HEAPRANGE;
    public static final int RESERVEDRANGEOFFSET;
    public static final int RESERVEDRANGESIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkDeviceAddressRangeEXT.SIZEOF, VkDeviceAddressRangeEXT.ALIGNOF), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HEAPRANGE = layout.offsetof(2);
        RESERVEDRANGEOFFSET = layout.offsetof(3);
        RESERVEDRANGESIZE = layout.offsetof(4);
    }

    protected VkBindHeapInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBindHeapInfoEXT create(long address, ByteBuffer container) {
        return new VkBindHeapInfoEXT(address, container);
    }

    public VkBindHeapInfoEXT(ByteBuffer container) {
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

    public VkDeviceAddressRangeEXT heapRange() {
        return nheapRange(address());
    }

    @NativeType("VkDeviceSize")
    public long reservedRangeOffset() {
        return nreservedRangeOffset(address());
    }

    @NativeType("VkDeviceSize")
    public long reservedRangeSize() {
        return nreservedRangeSize(address());
    }

    public VkBindHeapInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBindHeapInfoEXT sType$Default() {
        return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_BIND_HEAP_INFO_EXT);
    }

    public VkBindHeapInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBindHeapInfoEXT heapRange(VkDeviceAddressRangeEXT value) {
        nheapRange(address(), value);
        return this;
    }

    public VkBindHeapInfoEXT heapRange(Consumer<VkDeviceAddressRangeEXT> consumer) {
        consumer.accept(heapRange());
        return this;
    }

    public VkBindHeapInfoEXT reservedRangeOffset(@NativeType("VkDeviceSize") long value) {
        nreservedRangeOffset(address(), value);
        return this;
    }

    public VkBindHeapInfoEXT reservedRangeSize(@NativeType("VkDeviceSize") long value) {
        nreservedRangeSize(address(), value);
        return this;
    }

    public VkBindHeapInfoEXT set(int sType, long pNext, VkDeviceAddressRangeEXT heapRange, long reservedRangeOffset, long reservedRangeSize) {
        sType(sType);
        pNext(pNext);
        heapRange(heapRange);
        reservedRangeOffset(reservedRangeOffset);
        reservedRangeSize(reservedRangeSize);
        return this;
    }

    public VkBindHeapInfoEXT set(VkBindHeapInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindHeapInfoEXT malloc() {
        return new VkBindHeapInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindHeapInfoEXT calloc() {
        return new VkBindHeapInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindHeapInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindHeapInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkBindHeapInfoEXT create(long address) {
        return new VkBindHeapInfoEXT(address, null);
    }

    public static VkBindHeapInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindHeapInfoEXT(address, null);
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

    public static VkBindHeapInfoEXT malloc(MemoryStack stack) {
        return new VkBindHeapInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindHeapInfoEXT calloc(MemoryStack stack) {
        return new VkBindHeapInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkDeviceAddressRangeEXT nheapRange(long struct) {
        return VkDeviceAddressRangeEXT.create(struct + HEAPRANGE);
    }

    public static long nreservedRangeOffset(long struct) {
        return MemoryUtil.memGetLong(struct + RESERVEDRANGEOFFSET);
    }

    public static long nreservedRangeSize(long struct) {
        return MemoryUtil.memGetLong(struct + RESERVEDRANGESIZE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nheapRange(long struct, VkDeviceAddressRangeEXT value) {
        MemoryUtil.memCopy(value.address(), struct + HEAPRANGE, VkDeviceAddressRangeEXT.SIZEOF);
    }

    public static void nreservedRangeOffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + RESERVEDRANGEOFFSET, value);
    }

    public static void nreservedRangeSize(long struct, long value) {
        MemoryUtil.memPutLong(struct + RESERVEDRANGESIZE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindHeapInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkBindHeapInfoEXT, Buffer> implements NativeResource {
        private static final VkBindHeapInfoEXT ELEMENT_FACTORY = VkBindHeapInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBindHeapInfoEXT.SIZEOF);
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
        public VkBindHeapInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBindHeapInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBindHeapInfoEXT.npNext(address());
        }

        public VkDeviceAddressRangeEXT heapRange() {
            return VkBindHeapInfoEXT.nheapRange(address());
        }

        @NativeType("VkDeviceSize")
        public long reservedRangeOffset() {
            return VkBindHeapInfoEXT.nreservedRangeOffset(address());
        }

        @NativeType("VkDeviceSize")
        public long reservedRangeSize() {
            return VkBindHeapInfoEXT.nreservedRangeSize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBindHeapInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_BIND_HEAP_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBindHeapInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer heapRange(VkDeviceAddressRangeEXT value) {
            VkBindHeapInfoEXT.nheapRange(address(), value);
            return this;
        }

        public Buffer heapRange(Consumer<VkDeviceAddressRangeEXT> consumer) {
            consumer.accept(heapRange());
            return this;
        }

        public Buffer reservedRangeOffset(@NativeType("VkDeviceSize") long value) {
            VkBindHeapInfoEXT.nreservedRangeOffset(address(), value);
            return this;
        }

        public Buffer reservedRangeSize(@NativeType("VkDeviceSize") long value) {
            VkBindHeapInfoEXT.nreservedRangeSize(address(), value);
            return this;
        }
    }
}
