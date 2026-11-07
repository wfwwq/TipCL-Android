package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265RateControlInfoEXT.class */
public class VkVideoEncodeH265RateControlInfoEXT extends Struct<VkVideoEncodeH265RateControlInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int GOPFRAMECOUNT;
    public static final int IDRPERIOD;
    public static final int CONSECUTIVEBFRAMECOUNT;
    public static final int SUBLAYERCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        GOPFRAMECOUNT = layout.offsetof(3);
        IDRPERIOD = layout.offsetof(4);
        CONSECUTIVEBFRAMECOUNT = layout.offsetof(5);
        SUBLAYERCOUNT = layout.offsetof(6);
    }

    protected VkVideoEncodeH265RateControlInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH265RateControlInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265RateControlInfoEXT(address, container);
    }

    public VkVideoEncodeH265RateControlInfoEXT(ByteBuffer container) {
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

    @NativeType("VkVideoEncodeH265RateControlFlagsEXT")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int gopFrameCount() {
        return ngopFrameCount(address());
    }

    @NativeType("uint32_t")
    public int idrPeriod() {
        return nidrPeriod(address());
    }

    @NativeType("uint32_t")
    public int consecutiveBFrameCount() {
        return nconsecutiveBFrameCount(address());
    }

    @NativeType("uint32_t")
    public int subLayerCount() {
        return nsubLayerCount(address());
    }

    public VkVideoEncodeH265RateControlInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH265RateControlInfoEXT sType$Default() {
        return sType(1000039009);
    }

    public VkVideoEncodeH265RateControlInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH265RateControlInfoEXT flags(@NativeType("VkVideoEncodeH265RateControlFlagsEXT") int value) {
        nflags(address(), value);
        return this;
    }

    public VkVideoEncodeH265RateControlInfoEXT gopFrameCount(@NativeType("uint32_t") int value) {
        ngopFrameCount(address(), value);
        return this;
    }

    public VkVideoEncodeH265RateControlInfoEXT idrPeriod(@NativeType("uint32_t") int value) {
        nidrPeriod(address(), value);
        return this;
    }

    public VkVideoEncodeH265RateControlInfoEXT consecutiveBFrameCount(@NativeType("uint32_t") int value) {
        nconsecutiveBFrameCount(address(), value);
        return this;
    }

    public VkVideoEncodeH265RateControlInfoEXT subLayerCount(@NativeType("uint32_t") int value) {
        nsubLayerCount(address(), value);
        return this;
    }

    public VkVideoEncodeH265RateControlInfoEXT set(int sType, long pNext, int flags, int gopFrameCount, int idrPeriod, int consecutiveBFrameCount, int subLayerCount) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        gopFrameCount(gopFrameCount);
        idrPeriod(idrPeriod);
        consecutiveBFrameCount(consecutiveBFrameCount);
        subLayerCount(subLayerCount);
        return this;
    }

    public VkVideoEncodeH265RateControlInfoEXT set(VkVideoEncodeH265RateControlInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH265RateControlInfoEXT malloc() {
        return new VkVideoEncodeH265RateControlInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH265RateControlInfoEXT calloc() {
        return new VkVideoEncodeH265RateControlInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH265RateControlInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265RateControlInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH265RateControlInfoEXT create(long address) {
        return new VkVideoEncodeH265RateControlInfoEXT(address, null);
    }

    @Nullable
    public static VkVideoEncodeH265RateControlInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH265RateControlInfoEXT(address, null);
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

    public static VkVideoEncodeH265RateControlInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH265RateControlInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH265RateControlInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH265RateControlInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return UNSAFE.getInt((Object) null, struct + FLAGS);
    }

    public static int ngopFrameCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + GOPFRAMECOUNT);
    }

    public static int nidrPeriod(long struct) {
        return UNSAFE.getInt((Object) null, struct + IDRPERIOD);
    }

    public static int nconsecutiveBFrameCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + CONSECUTIVEBFRAMECOUNT);
    }

    public static int nsubLayerCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + SUBLAYERCOUNT);
    }

    public static void nsType(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + FLAGS, value);
    }

    public static void ngopFrameCount(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + GOPFRAMECOUNT, value);
    }

    public static void nidrPeriod(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + IDRPERIOD, value);
    }

    public static void nconsecutiveBFrameCount(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + CONSECUTIVEBFRAMECOUNT, value);
    }

    public static void nsubLayerCount(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + SUBLAYERCOUNT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265RateControlInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265RateControlInfoEXT, Buffer> implements NativeResource {
        private static final VkVideoEncodeH265RateControlInfoEXT ELEMENT_FACTORY = VkVideoEncodeH265RateControlInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH265RateControlInfoEXT.SIZEOF);
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
        public VkVideoEncodeH265RateControlInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH265RateControlInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH265RateControlInfoEXT.npNext(address());
        }

        @NativeType("VkVideoEncodeH265RateControlFlagsEXT")
        public int flags() {
            return VkVideoEncodeH265RateControlInfoEXT.nflags(address());
        }

        @NativeType("uint32_t")
        public int gopFrameCount() {
            return VkVideoEncodeH265RateControlInfoEXT.ngopFrameCount(address());
        }

        @NativeType("uint32_t")
        public int idrPeriod() {
            return VkVideoEncodeH265RateControlInfoEXT.nidrPeriod(address());
        }

        @NativeType("uint32_t")
        public int consecutiveBFrameCount() {
            return VkVideoEncodeH265RateControlInfoEXT.nconsecutiveBFrameCount(address());
        }

        @NativeType("uint32_t")
        public int subLayerCount() {
            return VkVideoEncodeH265RateControlInfoEXT.nsubLayerCount(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH265RateControlInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000039009);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH265RateControlInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkVideoEncodeH265RateControlFlagsEXT") int value) {
            VkVideoEncodeH265RateControlInfoEXT.nflags(address(), value);
            return this;
        }

        public Buffer gopFrameCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265RateControlInfoEXT.ngopFrameCount(address(), value);
            return this;
        }

        public Buffer idrPeriod(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265RateControlInfoEXT.nidrPeriod(address(), value);
            return this;
        }

        public Buffer consecutiveBFrameCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265RateControlInfoEXT.nconsecutiveBFrameCount(address(), value);
            return this;
        }

        public Buffer subLayerCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265RateControlInfoEXT.nsubLayerCount(address(), value);
            return this;
        }
    }
}
