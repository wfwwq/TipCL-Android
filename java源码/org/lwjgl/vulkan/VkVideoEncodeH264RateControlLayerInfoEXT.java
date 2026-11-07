package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264RateControlLayerInfoEXT.class */
public class VkVideoEncodeH264RateControlLayerInfoEXT extends Struct<VkVideoEncodeH264RateControlLayerInfoEXT> implements NativeResource {
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
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkVideoEncodeH264QpEXT.SIZEOF, VkVideoEncodeH264QpEXT.ALIGNOF), __member(4), __member(VkVideoEncodeH264QpEXT.SIZEOF, VkVideoEncodeH264QpEXT.ALIGNOF), __member(4), __member(VkVideoEncodeH264FrameSizeEXT.SIZEOF, VkVideoEncodeH264FrameSizeEXT.ALIGNOF));
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

    protected VkVideoEncodeH264RateControlLayerInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH264RateControlLayerInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264RateControlLayerInfoEXT(address, container);
    }

    public VkVideoEncodeH264RateControlLayerInfoEXT(ByteBuffer container) {
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

    public VkVideoEncodeH264QpEXT minQp() {
        return nminQp(address());
    }

    @NativeType("VkBool32")
    public boolean useMaxQp() {
        return nuseMaxQp(address()) != 0;
    }

    public VkVideoEncodeH264QpEXT maxQp() {
        return nmaxQp(address());
    }

    @NativeType("VkBool32")
    public boolean useMaxFrameSize() {
        return nuseMaxFrameSize(address()) != 0;
    }

    public VkVideoEncodeH264FrameSizeEXT maxFrameSize() {
        return nmaxFrameSize(address());
    }

    public VkVideoEncodeH264RateControlLayerInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH264RateControlLayerInfoEXT sType$Default() {
        return sType(1000038009);
    }

    public VkVideoEncodeH264RateControlLayerInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH264RateControlLayerInfoEXT useMinQp(@NativeType("VkBool32") boolean value) {
        nuseMinQp(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH264RateControlLayerInfoEXT minQp(VkVideoEncodeH264QpEXT value) {
        nminQp(address(), value);
        return this;
    }

    public VkVideoEncodeH264RateControlLayerInfoEXT minQp(Consumer<VkVideoEncodeH264QpEXT> consumer) {
        consumer.accept(minQp());
        return this;
    }

    public VkVideoEncodeH264RateControlLayerInfoEXT useMaxQp(@NativeType("VkBool32") boolean value) {
        nuseMaxQp(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH264RateControlLayerInfoEXT maxQp(VkVideoEncodeH264QpEXT value) {
        nmaxQp(address(), value);
        return this;
    }

    public VkVideoEncodeH264RateControlLayerInfoEXT maxQp(Consumer<VkVideoEncodeH264QpEXT> consumer) {
        consumer.accept(maxQp());
        return this;
    }

    public VkVideoEncodeH264RateControlLayerInfoEXT useMaxFrameSize(@NativeType("VkBool32") boolean value) {
        nuseMaxFrameSize(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH264RateControlLayerInfoEXT maxFrameSize(VkVideoEncodeH264FrameSizeEXT value) {
        nmaxFrameSize(address(), value);
        return this;
    }

    public VkVideoEncodeH264RateControlLayerInfoEXT maxFrameSize(Consumer<VkVideoEncodeH264FrameSizeEXT> consumer) {
        consumer.accept(maxFrameSize());
        return this;
    }

    public VkVideoEncodeH264RateControlLayerInfoEXT set(int sType, long pNext, boolean useMinQp, VkVideoEncodeH264QpEXT minQp, boolean useMaxQp, VkVideoEncodeH264QpEXT maxQp, boolean useMaxFrameSize, VkVideoEncodeH264FrameSizeEXT maxFrameSize) {
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

    public VkVideoEncodeH264RateControlLayerInfoEXT set(VkVideoEncodeH264RateControlLayerInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH264RateControlLayerInfoEXT malloc() {
        return new VkVideoEncodeH264RateControlLayerInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH264RateControlLayerInfoEXT calloc() {
        return new VkVideoEncodeH264RateControlLayerInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH264RateControlLayerInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264RateControlLayerInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH264RateControlLayerInfoEXT create(long address) {
        return new VkVideoEncodeH264RateControlLayerInfoEXT(address, null);
    }

    @Nullable
    public static VkVideoEncodeH264RateControlLayerInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH264RateControlLayerInfoEXT(address, null);
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

    @Nullable
    public static Buffer createSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return new Buffer(address, capacity);
    }

    public static VkVideoEncodeH264RateControlLayerInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH264RateControlLayerInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH264RateControlLayerInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH264RateControlLayerInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return UNSAFE.getInt((Object) null, struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static int nuseMinQp(long struct) {
        return UNSAFE.getInt((Object) null, struct + USEMINQP);
    }

    public static VkVideoEncodeH264QpEXT nminQp(long struct) {
        return VkVideoEncodeH264QpEXT.create(struct + MINQP);
    }

    public static int nuseMaxQp(long struct) {
        return UNSAFE.getInt((Object) null, struct + USEMAXQP);
    }

    public static VkVideoEncodeH264QpEXT nmaxQp(long struct) {
        return VkVideoEncodeH264QpEXT.create(struct + MAXQP);
    }

    public static int nuseMaxFrameSize(long struct) {
        return UNSAFE.getInt((Object) null, struct + USEMAXFRAMESIZE);
    }

    public static VkVideoEncodeH264FrameSizeEXT nmaxFrameSize(long struct) {
        return VkVideoEncodeH264FrameSizeEXT.create(struct + MAXFRAMESIZE);
    }

    public static void nsType(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nuseMinQp(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + USEMINQP, value);
    }

    public static void nminQp(long struct, VkVideoEncodeH264QpEXT value) {
        MemoryUtil.memCopy(value.address(), struct + MINQP, VkVideoEncodeH264QpEXT.SIZEOF);
    }

    public static void nuseMaxQp(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + USEMAXQP, value);
    }

    public static void nmaxQp(long struct, VkVideoEncodeH264QpEXT value) {
        MemoryUtil.memCopy(value.address(), struct + MAXQP, VkVideoEncodeH264QpEXT.SIZEOF);
    }

    public static void nuseMaxFrameSize(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + USEMAXFRAMESIZE, value);
    }

    public static void nmaxFrameSize(long struct, VkVideoEncodeH264FrameSizeEXT value) {
        MemoryUtil.memCopy(value.address(), struct + MAXFRAMESIZE, VkVideoEncodeH264FrameSizeEXT.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264RateControlLayerInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264RateControlLayerInfoEXT, Buffer> implements NativeResource {
        private static final VkVideoEncodeH264RateControlLayerInfoEXT ELEMENT_FACTORY = VkVideoEncodeH264RateControlLayerInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH264RateControlLayerInfoEXT.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public VkVideoEncodeH264RateControlLayerInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH264RateControlLayerInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH264RateControlLayerInfoEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean useMinQp() {
            return VkVideoEncodeH264RateControlLayerInfoEXT.nuseMinQp(address()) != 0;
        }

        public VkVideoEncodeH264QpEXT minQp() {
            return VkVideoEncodeH264RateControlLayerInfoEXT.nminQp(address());
        }

        @NativeType("VkBool32")
        public boolean useMaxQp() {
            return VkVideoEncodeH264RateControlLayerInfoEXT.nuseMaxQp(address()) != 0;
        }

        public VkVideoEncodeH264QpEXT maxQp() {
            return VkVideoEncodeH264RateControlLayerInfoEXT.nmaxQp(address());
        }

        @NativeType("VkBool32")
        public boolean useMaxFrameSize() {
            return VkVideoEncodeH264RateControlLayerInfoEXT.nuseMaxFrameSize(address()) != 0;
        }

        public VkVideoEncodeH264FrameSizeEXT maxFrameSize() {
            return VkVideoEncodeH264RateControlLayerInfoEXT.nmaxFrameSize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH264RateControlLayerInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000038009);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH264RateControlLayerInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer useMinQp(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH264RateControlLayerInfoEXT.nuseMinQp(address(), value ? 1 : 0);
            return this;
        }

        public Buffer minQp(VkVideoEncodeH264QpEXT value) {
            VkVideoEncodeH264RateControlLayerInfoEXT.nminQp(address(), value);
            return this;
        }

        public Buffer minQp(Consumer<VkVideoEncodeH264QpEXT> consumer) {
            consumer.accept(minQp());
            return this;
        }

        public Buffer useMaxQp(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH264RateControlLayerInfoEXT.nuseMaxQp(address(), value ? 1 : 0);
            return this;
        }

        public Buffer maxQp(VkVideoEncodeH264QpEXT value) {
            VkVideoEncodeH264RateControlLayerInfoEXT.nmaxQp(address(), value);
            return this;
        }

        public Buffer maxQp(Consumer<VkVideoEncodeH264QpEXT> consumer) {
            consumer.accept(maxQp());
            return this;
        }

        public Buffer useMaxFrameSize(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH264RateControlLayerInfoEXT.nuseMaxFrameSize(address(), value ? 1 : 0);
            return this;
        }

        public Buffer maxFrameSize(VkVideoEncodeH264FrameSizeEXT value) {
            VkVideoEncodeH264RateControlLayerInfoEXT.nmaxFrameSize(address(), value);
            return this;
        }

        public Buffer maxFrameSize(Consumer<VkVideoEncodeH264FrameSizeEXT> consumer) {
            consumer.accept(maxFrameSize());
            return this;
        }
    }
}
