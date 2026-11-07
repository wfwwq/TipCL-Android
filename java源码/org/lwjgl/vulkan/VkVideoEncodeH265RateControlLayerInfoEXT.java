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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265RateControlLayerInfoEXT.class */
public class VkVideoEncodeH265RateControlLayerInfoEXT extends Struct<VkVideoEncodeH265RateControlLayerInfoEXT> implements NativeResource {
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
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkVideoEncodeH265QpEXT.SIZEOF, VkVideoEncodeH265QpEXT.ALIGNOF), __member(4), __member(VkVideoEncodeH265QpEXT.SIZEOF, VkVideoEncodeH265QpEXT.ALIGNOF), __member(4), __member(VkVideoEncodeH265FrameSizeEXT.SIZEOF, VkVideoEncodeH265FrameSizeEXT.ALIGNOF));
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

    protected VkVideoEncodeH265RateControlLayerInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH265RateControlLayerInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265RateControlLayerInfoEXT(address, container);
    }

    public VkVideoEncodeH265RateControlLayerInfoEXT(ByteBuffer container) {
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

    public VkVideoEncodeH265QpEXT minQp() {
        return nminQp(address());
    }

    @NativeType("VkBool32")
    public boolean useMaxQp() {
        return nuseMaxQp(address()) != 0;
    }

    public VkVideoEncodeH265QpEXT maxQp() {
        return nmaxQp(address());
    }

    @NativeType("VkBool32")
    public boolean useMaxFrameSize() {
        return nuseMaxFrameSize(address()) != 0;
    }

    public VkVideoEncodeH265FrameSizeEXT maxFrameSize() {
        return nmaxFrameSize(address());
    }

    public VkVideoEncodeH265RateControlLayerInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH265RateControlLayerInfoEXT sType$Default() {
        return sType(1000039010);
    }

    public VkVideoEncodeH265RateControlLayerInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH265RateControlLayerInfoEXT useMinQp(@NativeType("VkBool32") boolean value) {
        nuseMinQp(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH265RateControlLayerInfoEXT minQp(VkVideoEncodeH265QpEXT value) {
        nminQp(address(), value);
        return this;
    }

    public VkVideoEncodeH265RateControlLayerInfoEXT minQp(Consumer<VkVideoEncodeH265QpEXT> consumer) {
        consumer.accept(minQp());
        return this;
    }

    public VkVideoEncodeH265RateControlLayerInfoEXT useMaxQp(@NativeType("VkBool32") boolean value) {
        nuseMaxQp(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH265RateControlLayerInfoEXT maxQp(VkVideoEncodeH265QpEXT value) {
        nmaxQp(address(), value);
        return this;
    }

    public VkVideoEncodeH265RateControlLayerInfoEXT maxQp(Consumer<VkVideoEncodeH265QpEXT> consumer) {
        consumer.accept(maxQp());
        return this;
    }

    public VkVideoEncodeH265RateControlLayerInfoEXT useMaxFrameSize(@NativeType("VkBool32") boolean value) {
        nuseMaxFrameSize(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH265RateControlLayerInfoEXT maxFrameSize(VkVideoEncodeH265FrameSizeEXT value) {
        nmaxFrameSize(address(), value);
        return this;
    }

    public VkVideoEncodeH265RateControlLayerInfoEXT maxFrameSize(Consumer<VkVideoEncodeH265FrameSizeEXT> consumer) {
        consumer.accept(maxFrameSize());
        return this;
    }

    public VkVideoEncodeH265RateControlLayerInfoEXT set(int sType, long pNext, boolean useMinQp, VkVideoEncodeH265QpEXT minQp, boolean useMaxQp, VkVideoEncodeH265QpEXT maxQp, boolean useMaxFrameSize, VkVideoEncodeH265FrameSizeEXT maxFrameSize) {
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

    public VkVideoEncodeH265RateControlLayerInfoEXT set(VkVideoEncodeH265RateControlLayerInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH265RateControlLayerInfoEXT malloc() {
        return new VkVideoEncodeH265RateControlLayerInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH265RateControlLayerInfoEXT calloc() {
        return new VkVideoEncodeH265RateControlLayerInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH265RateControlLayerInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265RateControlLayerInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH265RateControlLayerInfoEXT create(long address) {
        return new VkVideoEncodeH265RateControlLayerInfoEXT(address, null);
    }

    @Nullable
    public static VkVideoEncodeH265RateControlLayerInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH265RateControlLayerInfoEXT(address, null);
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

    public static VkVideoEncodeH265RateControlLayerInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH265RateControlLayerInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH265RateControlLayerInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH265RateControlLayerInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkVideoEncodeH265QpEXT nminQp(long struct) {
        return VkVideoEncodeH265QpEXT.create(struct + MINQP);
    }

    public static int nuseMaxQp(long struct) {
        return UNSAFE.getInt((Object) null, struct + USEMAXQP);
    }

    public static VkVideoEncodeH265QpEXT nmaxQp(long struct) {
        return VkVideoEncodeH265QpEXT.create(struct + MAXQP);
    }

    public static int nuseMaxFrameSize(long struct) {
        return UNSAFE.getInt((Object) null, struct + USEMAXFRAMESIZE);
    }

    public static VkVideoEncodeH265FrameSizeEXT nmaxFrameSize(long struct) {
        return VkVideoEncodeH265FrameSizeEXT.create(struct + MAXFRAMESIZE);
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

    public static void nminQp(long struct, VkVideoEncodeH265QpEXT value) {
        MemoryUtil.memCopy(value.address(), struct + MINQP, VkVideoEncodeH265QpEXT.SIZEOF);
    }

    public static void nuseMaxQp(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + USEMAXQP, value);
    }

    public static void nmaxQp(long struct, VkVideoEncodeH265QpEXT value) {
        MemoryUtil.memCopy(value.address(), struct + MAXQP, VkVideoEncodeH265QpEXT.SIZEOF);
    }

    public static void nuseMaxFrameSize(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + USEMAXFRAMESIZE, value);
    }

    public static void nmaxFrameSize(long struct, VkVideoEncodeH265FrameSizeEXT value) {
        MemoryUtil.memCopy(value.address(), struct + MAXFRAMESIZE, VkVideoEncodeH265FrameSizeEXT.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265RateControlLayerInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265RateControlLayerInfoEXT, Buffer> implements NativeResource {
        private static final VkVideoEncodeH265RateControlLayerInfoEXT ELEMENT_FACTORY = VkVideoEncodeH265RateControlLayerInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH265RateControlLayerInfoEXT.SIZEOF);
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
        public VkVideoEncodeH265RateControlLayerInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH265RateControlLayerInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH265RateControlLayerInfoEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean useMinQp() {
            return VkVideoEncodeH265RateControlLayerInfoEXT.nuseMinQp(address()) != 0;
        }

        public VkVideoEncodeH265QpEXT minQp() {
            return VkVideoEncodeH265RateControlLayerInfoEXT.nminQp(address());
        }

        @NativeType("VkBool32")
        public boolean useMaxQp() {
            return VkVideoEncodeH265RateControlLayerInfoEXT.nuseMaxQp(address()) != 0;
        }

        public VkVideoEncodeH265QpEXT maxQp() {
            return VkVideoEncodeH265RateControlLayerInfoEXT.nmaxQp(address());
        }

        @NativeType("VkBool32")
        public boolean useMaxFrameSize() {
            return VkVideoEncodeH265RateControlLayerInfoEXT.nuseMaxFrameSize(address()) != 0;
        }

        public VkVideoEncodeH265FrameSizeEXT maxFrameSize() {
            return VkVideoEncodeH265RateControlLayerInfoEXT.nmaxFrameSize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH265RateControlLayerInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000039010);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH265RateControlLayerInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer useMinQp(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH265RateControlLayerInfoEXT.nuseMinQp(address(), value ? 1 : 0);
            return this;
        }

        public Buffer minQp(VkVideoEncodeH265QpEXT value) {
            VkVideoEncodeH265RateControlLayerInfoEXT.nminQp(address(), value);
            return this;
        }

        public Buffer minQp(Consumer<VkVideoEncodeH265QpEXT> consumer) {
            consumer.accept(minQp());
            return this;
        }

        public Buffer useMaxQp(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH265RateControlLayerInfoEXT.nuseMaxQp(address(), value ? 1 : 0);
            return this;
        }

        public Buffer maxQp(VkVideoEncodeH265QpEXT value) {
            VkVideoEncodeH265RateControlLayerInfoEXT.nmaxQp(address(), value);
            return this;
        }

        public Buffer maxQp(Consumer<VkVideoEncodeH265QpEXT> consumer) {
            consumer.accept(maxQp());
            return this;
        }

        public Buffer useMaxFrameSize(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH265RateControlLayerInfoEXT.nuseMaxFrameSize(address(), value ? 1 : 0);
            return this;
        }

        public Buffer maxFrameSize(VkVideoEncodeH265FrameSizeEXT value) {
            VkVideoEncodeH265RateControlLayerInfoEXT.nmaxFrameSize(address(), value);
            return this;
        }

        public Buffer maxFrameSize(Consumer<VkVideoEncodeH265FrameSizeEXT> consumer) {
            consumer.accept(maxFrameSize());
            return this;
        }
    }
}
