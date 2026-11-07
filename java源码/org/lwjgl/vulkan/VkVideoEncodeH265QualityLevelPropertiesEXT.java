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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265QualityLevelPropertiesEXT.class */
public class VkVideoEncodeH265QualityLevelPropertiesEXT extends Struct<VkVideoEncodeH265QualityLevelPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PREFERREDRATECONTROLFLAGS;
    public static final int PREFERREDGOPFRAMECOUNT;
    public static final int PREFERREDIDRPERIOD;
    public static final int PREFERREDCONSECUTIVEBFRAMECOUNT;
    public static final int PREFERREDSUBLAYERCOUNT;
    public static final int PREFERREDCONSTANTQP;
    public static final int PREFERREDMAXL0REFERENCECOUNT;
    public static final int PREFERREDMAXL1REFERENCECOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(VkVideoEncodeH265QpEXT.SIZEOF, VkVideoEncodeH265QpEXT.ALIGNOF), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PREFERREDRATECONTROLFLAGS = layout.offsetof(2);
        PREFERREDGOPFRAMECOUNT = layout.offsetof(3);
        PREFERREDIDRPERIOD = layout.offsetof(4);
        PREFERREDCONSECUTIVEBFRAMECOUNT = layout.offsetof(5);
        PREFERREDSUBLAYERCOUNT = layout.offsetof(6);
        PREFERREDCONSTANTQP = layout.offsetof(7);
        PREFERREDMAXL0REFERENCECOUNT = layout.offsetof(8);
        PREFERREDMAXL1REFERENCECOUNT = layout.offsetof(9);
    }

    protected VkVideoEncodeH265QualityLevelPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH265QualityLevelPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265QualityLevelPropertiesEXT(address, container);
    }

    public VkVideoEncodeH265QualityLevelPropertiesEXT(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkVideoEncodeH265RateControlFlagsEXT")
    public int preferredRateControlFlags() {
        return npreferredRateControlFlags(address());
    }

    @NativeType("uint32_t")
    public int preferredGopFrameCount() {
        return npreferredGopFrameCount(address());
    }

    @NativeType("uint32_t")
    public int preferredIdrPeriod() {
        return npreferredIdrPeriod(address());
    }

    @NativeType("uint32_t")
    public int preferredConsecutiveBFrameCount() {
        return npreferredConsecutiveBFrameCount(address());
    }

    @NativeType("uint32_t")
    public int preferredSubLayerCount() {
        return npreferredSubLayerCount(address());
    }

    public VkVideoEncodeH265QpEXT preferredConstantQp() {
        return npreferredConstantQp(address());
    }

    @NativeType("uint32_t")
    public int preferredMaxL0ReferenceCount() {
        return npreferredMaxL0ReferenceCount(address());
    }

    @NativeType("uint32_t")
    public int preferredMaxL1ReferenceCount() {
        return npreferredMaxL1ReferenceCount(address());
    }

    public VkVideoEncodeH265QualityLevelPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH265QualityLevelPropertiesEXT sType$Default() {
        return sType(1000039012);
    }

    public VkVideoEncodeH265QualityLevelPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH265QualityLevelPropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkVideoEncodeH265QualityLevelPropertiesEXT set(VkVideoEncodeH265QualityLevelPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH265QualityLevelPropertiesEXT malloc() {
        return new VkVideoEncodeH265QualityLevelPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH265QualityLevelPropertiesEXT calloc() {
        return new VkVideoEncodeH265QualityLevelPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH265QualityLevelPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265QualityLevelPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH265QualityLevelPropertiesEXT create(long address) {
        return new VkVideoEncodeH265QualityLevelPropertiesEXT(address, null);
    }

    @Nullable
    public static VkVideoEncodeH265QualityLevelPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH265QualityLevelPropertiesEXT(address, null);
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

    public static VkVideoEncodeH265QualityLevelPropertiesEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH265QualityLevelPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH265QualityLevelPropertiesEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH265QualityLevelPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npreferredRateControlFlags(long struct) {
        return UNSAFE.getInt((Object) null, struct + PREFERREDRATECONTROLFLAGS);
    }

    public static int npreferredGopFrameCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + PREFERREDGOPFRAMECOUNT);
    }

    public static int npreferredIdrPeriod(long struct) {
        return UNSAFE.getInt((Object) null, struct + PREFERREDIDRPERIOD);
    }

    public static int npreferredConsecutiveBFrameCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + PREFERREDCONSECUTIVEBFRAMECOUNT);
    }

    public static int npreferredSubLayerCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + PREFERREDSUBLAYERCOUNT);
    }

    public static VkVideoEncodeH265QpEXT npreferredConstantQp(long struct) {
        return VkVideoEncodeH265QpEXT.create(struct + PREFERREDCONSTANTQP);
    }

    public static int npreferredMaxL0ReferenceCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + PREFERREDMAXL0REFERENCECOUNT);
    }

    public static int npreferredMaxL1ReferenceCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + PREFERREDMAXL1REFERENCECOUNT);
    }

    public static void nsType(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265QualityLevelPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265QualityLevelPropertiesEXT, Buffer> implements NativeResource {
        private static final VkVideoEncodeH265QualityLevelPropertiesEXT ELEMENT_FACTORY = VkVideoEncodeH265QualityLevelPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH265QualityLevelPropertiesEXT.SIZEOF);
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
        public VkVideoEncodeH265QualityLevelPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH265QualityLevelPropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkVideoEncodeH265QualityLevelPropertiesEXT.npNext(address());
        }

        @NativeType("VkVideoEncodeH265RateControlFlagsEXT")
        public int preferredRateControlFlags() {
            return VkVideoEncodeH265QualityLevelPropertiesEXT.npreferredRateControlFlags(address());
        }

        @NativeType("uint32_t")
        public int preferredGopFrameCount() {
            return VkVideoEncodeH265QualityLevelPropertiesEXT.npreferredGopFrameCount(address());
        }

        @NativeType("uint32_t")
        public int preferredIdrPeriod() {
            return VkVideoEncodeH265QualityLevelPropertiesEXT.npreferredIdrPeriod(address());
        }

        @NativeType("uint32_t")
        public int preferredConsecutiveBFrameCount() {
            return VkVideoEncodeH265QualityLevelPropertiesEXT.npreferredConsecutiveBFrameCount(address());
        }

        @NativeType("uint32_t")
        public int preferredSubLayerCount() {
            return VkVideoEncodeH265QualityLevelPropertiesEXT.npreferredSubLayerCount(address());
        }

        public VkVideoEncodeH265QpEXT preferredConstantQp() {
            return VkVideoEncodeH265QualityLevelPropertiesEXT.npreferredConstantQp(address());
        }

        @NativeType("uint32_t")
        public int preferredMaxL0ReferenceCount() {
            return VkVideoEncodeH265QualityLevelPropertiesEXT.npreferredMaxL0ReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int preferredMaxL1ReferenceCount() {
            return VkVideoEncodeH265QualityLevelPropertiesEXT.npreferredMaxL1ReferenceCount(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH265QualityLevelPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000039012);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkVideoEncodeH265QualityLevelPropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
