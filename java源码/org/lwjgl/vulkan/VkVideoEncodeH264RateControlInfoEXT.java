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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264RateControlInfoEXT.class */
public class VkVideoEncodeH264RateControlInfoEXT extends Struct<VkVideoEncodeH264RateControlInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int GOPFRAMECOUNT;
    public static final int IDRPERIOD;
    public static final int CONSECUTIVEBFRAMECOUNT;
    public static final int TEMPORALLAYERCOUNT;

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
        TEMPORALLAYERCOUNT = layout.offsetof(6);
    }

    protected VkVideoEncodeH264RateControlInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH264RateControlInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264RateControlInfoEXT(address, container);
    }

    public VkVideoEncodeH264RateControlInfoEXT(ByteBuffer container) {
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

    @NativeType("VkVideoEncodeH264RateControlFlagsEXT")
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
    public int temporalLayerCount() {
        return ntemporalLayerCount(address());
    }

    public VkVideoEncodeH264RateControlInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH264RateControlInfoEXT sType$Default() {
        return sType(1000038008);
    }

    public VkVideoEncodeH264RateControlInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH264RateControlInfoEXT flags(@NativeType("VkVideoEncodeH264RateControlFlagsEXT") int value) {
        nflags(address(), value);
        return this;
    }

    public VkVideoEncodeH264RateControlInfoEXT gopFrameCount(@NativeType("uint32_t") int value) {
        ngopFrameCount(address(), value);
        return this;
    }

    public VkVideoEncodeH264RateControlInfoEXT idrPeriod(@NativeType("uint32_t") int value) {
        nidrPeriod(address(), value);
        return this;
    }

    public VkVideoEncodeH264RateControlInfoEXT consecutiveBFrameCount(@NativeType("uint32_t") int value) {
        nconsecutiveBFrameCount(address(), value);
        return this;
    }

    public VkVideoEncodeH264RateControlInfoEXT temporalLayerCount(@NativeType("uint32_t") int value) {
        ntemporalLayerCount(address(), value);
        return this;
    }

    public VkVideoEncodeH264RateControlInfoEXT set(int sType, long pNext, int flags, int gopFrameCount, int idrPeriod, int consecutiveBFrameCount, int temporalLayerCount) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        gopFrameCount(gopFrameCount);
        idrPeriod(idrPeriod);
        consecutiveBFrameCount(consecutiveBFrameCount);
        temporalLayerCount(temporalLayerCount);
        return this;
    }

    public VkVideoEncodeH264RateControlInfoEXT set(VkVideoEncodeH264RateControlInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH264RateControlInfoEXT malloc() {
        return new VkVideoEncodeH264RateControlInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH264RateControlInfoEXT calloc() {
        return new VkVideoEncodeH264RateControlInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH264RateControlInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264RateControlInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH264RateControlInfoEXT create(long address) {
        return new VkVideoEncodeH264RateControlInfoEXT(address, null);
    }

    @Nullable
    public static VkVideoEncodeH264RateControlInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH264RateControlInfoEXT(address, null);
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

    public static VkVideoEncodeH264RateControlInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH264RateControlInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH264RateControlInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH264RateControlInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntemporalLayerCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + TEMPORALLAYERCOUNT);
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

    public static void ntemporalLayerCount(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + TEMPORALLAYERCOUNT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264RateControlInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264RateControlInfoEXT, Buffer> implements NativeResource {
        private static final VkVideoEncodeH264RateControlInfoEXT ELEMENT_FACTORY = VkVideoEncodeH264RateControlInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH264RateControlInfoEXT.SIZEOF);
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
        public VkVideoEncodeH264RateControlInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH264RateControlInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH264RateControlInfoEXT.npNext(address());
        }

        @NativeType("VkVideoEncodeH264RateControlFlagsEXT")
        public int flags() {
            return VkVideoEncodeH264RateControlInfoEXT.nflags(address());
        }

        @NativeType("uint32_t")
        public int gopFrameCount() {
            return VkVideoEncodeH264RateControlInfoEXT.ngopFrameCount(address());
        }

        @NativeType("uint32_t")
        public int idrPeriod() {
            return VkVideoEncodeH264RateControlInfoEXT.nidrPeriod(address());
        }

        @NativeType("uint32_t")
        public int consecutiveBFrameCount() {
            return VkVideoEncodeH264RateControlInfoEXT.nconsecutiveBFrameCount(address());
        }

        @NativeType("uint32_t")
        public int temporalLayerCount() {
            return VkVideoEncodeH264RateControlInfoEXT.ntemporalLayerCount(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH264RateControlInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000038008);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH264RateControlInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkVideoEncodeH264RateControlFlagsEXT") int value) {
            VkVideoEncodeH264RateControlInfoEXT.nflags(address(), value);
            return this;
        }

        public Buffer gopFrameCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeH264RateControlInfoEXT.ngopFrameCount(address(), value);
            return this;
        }

        public Buffer idrPeriod(@NativeType("uint32_t") int value) {
            VkVideoEncodeH264RateControlInfoEXT.nidrPeriod(address(), value);
            return this;
        }

        public Buffer consecutiveBFrameCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeH264RateControlInfoEXT.nconsecutiveBFrameCount(address(), value);
            return this;
        }

        public Buffer temporalLayerCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeH264RateControlInfoEXT.ntemporalLayerCount(address(), value);
            return this;
        }
    }
}
