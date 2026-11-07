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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeAV1RateControlLayerInfoKHR.class */
public class VkVideoEncodeAV1RateControlLayerInfoKHR extends Struct<VkVideoEncodeAV1RateControlLayerInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int USEMINQINDEX;
    public static final int MINQINDEX;
    public static final int USEMAXQINDEX;
    public static final int MAXQINDEX;
    public static final int USEMAXFRAMESIZE;
    public static final int MAXFRAMESIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkVideoEncodeAV1QIndexKHR.SIZEOF, VkVideoEncodeAV1QIndexKHR.ALIGNOF), __member(4), __member(VkVideoEncodeAV1QIndexKHR.SIZEOF, VkVideoEncodeAV1QIndexKHR.ALIGNOF), __member(4), __member(VkVideoEncodeAV1FrameSizeKHR.SIZEOF, VkVideoEncodeAV1FrameSizeKHR.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        USEMINQINDEX = layout.offsetof(2);
        MINQINDEX = layout.offsetof(3);
        USEMAXQINDEX = layout.offsetof(4);
        MAXQINDEX = layout.offsetof(5);
        USEMAXFRAMESIZE = layout.offsetof(6);
        MAXFRAMESIZE = layout.offsetof(7);
    }

    protected VkVideoEncodeAV1RateControlLayerInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeAV1RateControlLayerInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeAV1RateControlLayerInfoKHR(address, container);
    }

    public VkVideoEncodeAV1RateControlLayerInfoKHR(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean useMinQIndex() {
        return nuseMinQIndex(address()) != 0;
    }

    public VkVideoEncodeAV1QIndexKHR minQIndex() {
        return nminQIndex(address());
    }

    @NativeType("VkBool32")
    public boolean useMaxQIndex() {
        return nuseMaxQIndex(address()) != 0;
    }

    public VkVideoEncodeAV1QIndexKHR maxQIndex() {
        return nmaxQIndex(address());
    }

    @NativeType("VkBool32")
    public boolean useMaxFrameSize() {
        return nuseMaxFrameSize(address()) != 0;
    }

    public VkVideoEncodeAV1FrameSizeKHR maxFrameSize() {
        return nmaxFrameSize(address());
    }

    public VkVideoEncodeAV1RateControlLayerInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeAV1RateControlLayerInfoKHR sType$Default() {
        return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_LAYER_INFO_KHR);
    }

    public VkVideoEncodeAV1RateControlLayerInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeAV1RateControlLayerInfoKHR useMinQIndex(@NativeType("VkBool32") boolean value) {
        nuseMinQIndex(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeAV1RateControlLayerInfoKHR minQIndex(VkVideoEncodeAV1QIndexKHR value) {
        nminQIndex(address(), value);
        return this;
    }

    public VkVideoEncodeAV1RateControlLayerInfoKHR minQIndex(Consumer<VkVideoEncodeAV1QIndexKHR> consumer) {
        consumer.accept(minQIndex());
        return this;
    }

    public VkVideoEncodeAV1RateControlLayerInfoKHR useMaxQIndex(@NativeType("VkBool32") boolean value) {
        nuseMaxQIndex(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeAV1RateControlLayerInfoKHR maxQIndex(VkVideoEncodeAV1QIndexKHR value) {
        nmaxQIndex(address(), value);
        return this;
    }

    public VkVideoEncodeAV1RateControlLayerInfoKHR maxQIndex(Consumer<VkVideoEncodeAV1QIndexKHR> consumer) {
        consumer.accept(maxQIndex());
        return this;
    }

    public VkVideoEncodeAV1RateControlLayerInfoKHR useMaxFrameSize(@NativeType("VkBool32") boolean value) {
        nuseMaxFrameSize(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeAV1RateControlLayerInfoKHR maxFrameSize(VkVideoEncodeAV1FrameSizeKHR value) {
        nmaxFrameSize(address(), value);
        return this;
    }

    public VkVideoEncodeAV1RateControlLayerInfoKHR maxFrameSize(Consumer<VkVideoEncodeAV1FrameSizeKHR> consumer) {
        consumer.accept(maxFrameSize());
        return this;
    }

    public VkVideoEncodeAV1RateControlLayerInfoKHR set(int sType, long pNext, boolean useMinQIndex, VkVideoEncodeAV1QIndexKHR minQIndex, boolean useMaxQIndex, VkVideoEncodeAV1QIndexKHR maxQIndex, boolean useMaxFrameSize, VkVideoEncodeAV1FrameSizeKHR maxFrameSize) {
        sType(sType);
        pNext(pNext);
        useMinQIndex(useMinQIndex);
        minQIndex(minQIndex);
        useMaxQIndex(useMaxQIndex);
        maxQIndex(maxQIndex);
        useMaxFrameSize(useMaxFrameSize);
        maxFrameSize(maxFrameSize);
        return this;
    }

    public VkVideoEncodeAV1RateControlLayerInfoKHR set(VkVideoEncodeAV1RateControlLayerInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeAV1RateControlLayerInfoKHR malloc() {
        return new VkVideoEncodeAV1RateControlLayerInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeAV1RateControlLayerInfoKHR calloc() {
        return new VkVideoEncodeAV1RateControlLayerInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeAV1RateControlLayerInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1RateControlLayerInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeAV1RateControlLayerInfoKHR create(long address) {
        return new VkVideoEncodeAV1RateControlLayerInfoKHR(address, null);
    }

    public static VkVideoEncodeAV1RateControlLayerInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeAV1RateControlLayerInfoKHR(address, null);
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

    public static VkVideoEncodeAV1RateControlLayerInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1RateControlLayerInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeAV1RateControlLayerInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1RateControlLayerInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nuseMinQIndex(long struct) {
        return MemoryUtil.memGetInt(struct + USEMINQINDEX);
    }

    public static VkVideoEncodeAV1QIndexKHR nminQIndex(long struct) {
        return VkVideoEncodeAV1QIndexKHR.create(struct + MINQINDEX);
    }

    public static int nuseMaxQIndex(long struct) {
        return MemoryUtil.memGetInt(struct + USEMAXQINDEX);
    }

    public static VkVideoEncodeAV1QIndexKHR nmaxQIndex(long struct) {
        return VkVideoEncodeAV1QIndexKHR.create(struct + MAXQINDEX);
    }

    public static int nuseMaxFrameSize(long struct) {
        return MemoryUtil.memGetInt(struct + USEMAXFRAMESIZE);
    }

    public static VkVideoEncodeAV1FrameSizeKHR nmaxFrameSize(long struct) {
        return VkVideoEncodeAV1FrameSizeKHR.create(struct + MAXFRAMESIZE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nuseMinQIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + USEMINQINDEX, value);
    }

    public static void nminQIndex(long struct, VkVideoEncodeAV1QIndexKHR value) {
        MemoryUtil.memCopy(value.address(), struct + MINQINDEX, VkVideoEncodeAV1QIndexKHR.SIZEOF);
    }

    public static void nuseMaxQIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + USEMAXQINDEX, value);
    }

    public static void nmaxQIndex(long struct, VkVideoEncodeAV1QIndexKHR value) {
        MemoryUtil.memCopy(value.address(), struct + MAXQINDEX, VkVideoEncodeAV1QIndexKHR.SIZEOF);
    }

    public static void nuseMaxFrameSize(long struct, int value) {
        MemoryUtil.memPutInt(struct + USEMAXFRAMESIZE, value);
    }

    public static void nmaxFrameSize(long struct, VkVideoEncodeAV1FrameSizeKHR value) {
        MemoryUtil.memCopy(value.address(), struct + MAXFRAMESIZE, VkVideoEncodeAV1FrameSizeKHR.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeAV1RateControlLayerInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1RateControlLayerInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeAV1RateControlLayerInfoKHR ELEMENT_FACTORY = VkVideoEncodeAV1RateControlLayerInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeAV1RateControlLayerInfoKHR.SIZEOF);
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
        public VkVideoEncodeAV1RateControlLayerInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeAV1RateControlLayerInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeAV1RateControlLayerInfoKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean useMinQIndex() {
            return VkVideoEncodeAV1RateControlLayerInfoKHR.nuseMinQIndex(address()) != 0;
        }

        public VkVideoEncodeAV1QIndexKHR minQIndex() {
            return VkVideoEncodeAV1RateControlLayerInfoKHR.nminQIndex(address());
        }

        @NativeType("VkBool32")
        public boolean useMaxQIndex() {
            return VkVideoEncodeAV1RateControlLayerInfoKHR.nuseMaxQIndex(address()) != 0;
        }

        public VkVideoEncodeAV1QIndexKHR maxQIndex() {
            return VkVideoEncodeAV1RateControlLayerInfoKHR.nmaxQIndex(address());
        }

        @NativeType("VkBool32")
        public boolean useMaxFrameSize() {
            return VkVideoEncodeAV1RateControlLayerInfoKHR.nuseMaxFrameSize(address()) != 0;
        }

        public VkVideoEncodeAV1FrameSizeKHR maxFrameSize() {
            return VkVideoEncodeAV1RateControlLayerInfoKHR.nmaxFrameSize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeAV1RateControlLayerInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_LAYER_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeAV1RateControlLayerInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer useMinQIndex(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeAV1RateControlLayerInfoKHR.nuseMinQIndex(address(), value ? 1 : 0);
            return this;
        }

        public Buffer minQIndex(VkVideoEncodeAV1QIndexKHR value) {
            VkVideoEncodeAV1RateControlLayerInfoKHR.nminQIndex(address(), value);
            return this;
        }

        public Buffer minQIndex(Consumer<VkVideoEncodeAV1QIndexKHR> consumer) {
            consumer.accept(minQIndex());
            return this;
        }

        public Buffer useMaxQIndex(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeAV1RateControlLayerInfoKHR.nuseMaxQIndex(address(), value ? 1 : 0);
            return this;
        }

        public Buffer maxQIndex(VkVideoEncodeAV1QIndexKHR value) {
            VkVideoEncodeAV1RateControlLayerInfoKHR.nmaxQIndex(address(), value);
            return this;
        }

        public Buffer maxQIndex(Consumer<VkVideoEncodeAV1QIndexKHR> consumer) {
            consumer.accept(maxQIndex());
            return this;
        }

        public Buffer useMaxFrameSize(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeAV1RateControlLayerInfoKHR.nuseMaxFrameSize(address(), value ? 1 : 0);
            return this;
        }

        public Buffer maxFrameSize(VkVideoEncodeAV1FrameSizeKHR value) {
            VkVideoEncodeAV1RateControlLayerInfoKHR.nmaxFrameSize(address(), value);
            return this;
        }

        public Buffer maxFrameSize(Consumer<VkVideoEncodeAV1FrameSizeKHR> consumer) {
            consumer.accept(maxFrameSize());
            return this;
        }
    }
}
