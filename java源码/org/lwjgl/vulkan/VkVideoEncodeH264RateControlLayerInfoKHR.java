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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264RateControlLayerInfoKHR.class */
public class VkVideoEncodeH264RateControlLayerInfoKHR extends Struct<VkVideoEncodeH264RateControlLayerInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int USEMINQP;
    public static final int MINQP;
    public static final int USEMAXQP;
    public static final int MAXQP;
    public static final int USEMAXFRAMESIZE;
    public static final int MAXFRAMESIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkVideoEncodeH264QpKHR.SIZEOF, VkVideoEncodeH264QpKHR.ALIGNOF), __member(4), __member(VkVideoEncodeH264QpKHR.SIZEOF, VkVideoEncodeH264QpKHR.ALIGNOF), __member(4), __member(VkVideoEncodeH264FrameSizeKHR.SIZEOF, VkVideoEncodeH264FrameSizeKHR.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        USEMINQP = layout.offsetof(2);
        MINQP = layout.offsetof(3);
        USEMAXQP = layout.offsetof(4);
        MAXQP = layout.offsetof(5);
        USEMAXFRAMESIZE = layout.offsetof(6);
        MAXFRAMESIZE = layout.offsetof(7);
    }

    protected VkVideoEncodeH264RateControlLayerInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH264RateControlLayerInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeH264RateControlLayerInfoKHR(address, container);
    }

    public VkVideoEncodeH264RateControlLayerInfoKHR(ByteBuffer container) {
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
    public boolean useMinQp() {
        return nuseMinQp(address()) != 0;
    }

    public VkVideoEncodeH264QpKHR minQp() {
        return nminQp(address());
    }

    @NativeType("VkBool32")
    public boolean useMaxQp() {
        return nuseMaxQp(address()) != 0;
    }

    public VkVideoEncodeH264QpKHR maxQp() {
        return nmaxQp(address());
    }

    @NativeType("VkBool32")
    public boolean useMaxFrameSize() {
        return nuseMaxFrameSize(address()) != 0;
    }

    public VkVideoEncodeH264FrameSizeKHR maxFrameSize() {
        return nmaxFrameSize(address());
    }

    public VkVideoEncodeH264RateControlLayerInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH264RateControlLayerInfoKHR sType$Default() {
        return sType(1000038009);
    }

    public VkVideoEncodeH264RateControlLayerInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH264RateControlLayerInfoKHR useMinQp(@NativeType("VkBool32") boolean value) {
        nuseMinQp(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH264RateControlLayerInfoKHR minQp(VkVideoEncodeH264QpKHR value) {
        nminQp(address(), value);
        return this;
    }

    public VkVideoEncodeH264RateControlLayerInfoKHR minQp(Consumer<VkVideoEncodeH264QpKHR> consumer) {
        consumer.accept(minQp());
        return this;
    }

    public VkVideoEncodeH264RateControlLayerInfoKHR useMaxQp(@NativeType("VkBool32") boolean value) {
        nuseMaxQp(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH264RateControlLayerInfoKHR maxQp(VkVideoEncodeH264QpKHR value) {
        nmaxQp(address(), value);
        return this;
    }

    public VkVideoEncodeH264RateControlLayerInfoKHR maxQp(Consumer<VkVideoEncodeH264QpKHR> consumer) {
        consumer.accept(maxQp());
        return this;
    }

    public VkVideoEncodeH264RateControlLayerInfoKHR useMaxFrameSize(@NativeType("VkBool32") boolean value) {
        nuseMaxFrameSize(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH264RateControlLayerInfoKHR maxFrameSize(VkVideoEncodeH264FrameSizeKHR value) {
        nmaxFrameSize(address(), value);
        return this;
    }

    public VkVideoEncodeH264RateControlLayerInfoKHR maxFrameSize(Consumer<VkVideoEncodeH264FrameSizeKHR> consumer) {
        consumer.accept(maxFrameSize());
        return this;
    }

    public VkVideoEncodeH264RateControlLayerInfoKHR set(int sType, long pNext, boolean useMinQp, VkVideoEncodeH264QpKHR minQp, boolean useMaxQp, VkVideoEncodeH264QpKHR maxQp, boolean useMaxFrameSize, VkVideoEncodeH264FrameSizeKHR maxFrameSize) {
        sType(sType);
        pNext(pNext);
        useMinQp(useMinQp);
        minQp(minQp);
        useMaxQp(useMaxQp);
        maxQp(maxQp);
        useMaxFrameSize(useMaxFrameSize);
        maxFrameSize(maxFrameSize);
        return this;
    }

    public VkVideoEncodeH264RateControlLayerInfoKHR set(VkVideoEncodeH264RateControlLayerInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH264RateControlLayerInfoKHR malloc() {
        return new VkVideoEncodeH264RateControlLayerInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH264RateControlLayerInfoKHR calloc() {
        return new VkVideoEncodeH264RateControlLayerInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH264RateControlLayerInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264RateControlLayerInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH264RateControlLayerInfoKHR create(long address) {
        return new VkVideoEncodeH264RateControlLayerInfoKHR(address, null);
    }

    public static VkVideoEncodeH264RateControlLayerInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH264RateControlLayerInfoKHR(address, null);
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

    public static VkVideoEncodeH264RateControlLayerInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH264RateControlLayerInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH264RateControlLayerInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH264RateControlLayerInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nuseMinQp(long struct) {
        return MemoryUtil.memGetInt(struct + USEMINQP);
    }

    public static VkVideoEncodeH264QpKHR nminQp(long struct) {
        return VkVideoEncodeH264QpKHR.create(struct + MINQP);
    }

    public static int nuseMaxQp(long struct) {
        return MemoryUtil.memGetInt(struct + USEMAXQP);
    }

    public static VkVideoEncodeH264QpKHR nmaxQp(long struct) {
        return VkVideoEncodeH264QpKHR.create(struct + MAXQP);
    }

    public static int nuseMaxFrameSize(long struct) {
        return MemoryUtil.memGetInt(struct + USEMAXFRAMESIZE);
    }

    public static VkVideoEncodeH264FrameSizeKHR nmaxFrameSize(long struct) {
        return VkVideoEncodeH264FrameSizeKHR.create(struct + MAXFRAMESIZE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nuseMinQp(long struct, int value) {
        MemoryUtil.memPutInt(struct + USEMINQP, value);
    }

    public static void nminQp(long struct, VkVideoEncodeH264QpKHR value) {
        MemoryUtil.memCopy(value.address(), struct + MINQP, VkVideoEncodeH264QpKHR.SIZEOF);
    }

    public static void nuseMaxQp(long struct, int value) {
        MemoryUtil.memPutInt(struct + USEMAXQP, value);
    }

    public static void nmaxQp(long struct, VkVideoEncodeH264QpKHR value) {
        MemoryUtil.memCopy(value.address(), struct + MAXQP, VkVideoEncodeH264QpKHR.SIZEOF);
    }

    public static void nuseMaxFrameSize(long struct, int value) {
        MemoryUtil.memPutInt(struct + USEMAXFRAMESIZE, value);
    }

    public static void nmaxFrameSize(long struct, VkVideoEncodeH264FrameSizeKHR value) {
        MemoryUtil.memCopy(value.address(), struct + MAXFRAMESIZE, VkVideoEncodeH264FrameSizeKHR.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264RateControlLayerInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264RateControlLayerInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeH264RateControlLayerInfoKHR ELEMENT_FACTORY = VkVideoEncodeH264RateControlLayerInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH264RateControlLayerInfoKHR.SIZEOF);
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
        public VkVideoEncodeH264RateControlLayerInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH264RateControlLayerInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH264RateControlLayerInfoKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean useMinQp() {
            return VkVideoEncodeH264RateControlLayerInfoKHR.nuseMinQp(address()) != 0;
        }

        public VkVideoEncodeH264QpKHR minQp() {
            return VkVideoEncodeH264RateControlLayerInfoKHR.nminQp(address());
        }

        @NativeType("VkBool32")
        public boolean useMaxQp() {
            return VkVideoEncodeH264RateControlLayerInfoKHR.nuseMaxQp(address()) != 0;
        }

        public VkVideoEncodeH264QpKHR maxQp() {
            return VkVideoEncodeH264RateControlLayerInfoKHR.nmaxQp(address());
        }

        @NativeType("VkBool32")
        public boolean useMaxFrameSize() {
            return VkVideoEncodeH264RateControlLayerInfoKHR.nuseMaxFrameSize(address()) != 0;
        }

        public VkVideoEncodeH264FrameSizeKHR maxFrameSize() {
            return VkVideoEncodeH264RateControlLayerInfoKHR.nmaxFrameSize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH264RateControlLayerInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000038009);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH264RateControlLayerInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer useMinQp(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH264RateControlLayerInfoKHR.nuseMinQp(address(), value ? 1 : 0);
            return this;
        }

        public Buffer minQp(VkVideoEncodeH264QpKHR value) {
            VkVideoEncodeH264RateControlLayerInfoKHR.nminQp(address(), value);
            return this;
        }

        public Buffer minQp(Consumer<VkVideoEncodeH264QpKHR> consumer) {
            consumer.accept(minQp());
            return this;
        }

        public Buffer useMaxQp(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH264RateControlLayerInfoKHR.nuseMaxQp(address(), value ? 1 : 0);
            return this;
        }

        public Buffer maxQp(VkVideoEncodeH264QpKHR value) {
            VkVideoEncodeH264RateControlLayerInfoKHR.nmaxQp(address(), value);
            return this;
        }

        public Buffer maxQp(Consumer<VkVideoEncodeH264QpKHR> consumer) {
            consumer.accept(maxQp());
            return this;
        }

        public Buffer useMaxFrameSize(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH264RateControlLayerInfoKHR.nuseMaxFrameSize(address(), value ? 1 : 0);
            return this;
        }

        public Buffer maxFrameSize(VkVideoEncodeH264FrameSizeKHR value) {
            VkVideoEncodeH264RateControlLayerInfoKHR.nmaxFrameSize(address(), value);
            return this;
        }

        public Buffer maxFrameSize(Consumer<VkVideoEncodeH264FrameSizeKHR> consumer) {
            consumer.accept(maxFrameSize());
            return this;
        }
    }
}
