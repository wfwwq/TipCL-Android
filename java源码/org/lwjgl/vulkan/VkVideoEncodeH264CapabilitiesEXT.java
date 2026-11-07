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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264CapabilitiesEXT.class */
public class VkVideoEncodeH264CapabilitiesEXT extends Struct<VkVideoEncodeH264CapabilitiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int MAXLEVELIDC;
    public static final int MAXSLICECOUNT;
    public static final int MAXPPICTUREL0REFERENCECOUNT;
    public static final int MAXBPICTUREL0REFERENCECOUNT;
    public static final int MAXL1REFERENCECOUNT;
    public static final int MAXTEMPORALLAYERCOUNT;
    public static final int EXPECTDYADICTEMPORALLAYERPATTERN;
    public static final int MINQP;
    public static final int MAXQP;
    public static final int PREFERSGOPREMAININGFRAMES;
    public static final int REQUIRESGOPREMAININGFRAMES;
    public static final int STDSYNTAXFLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        MAXLEVELIDC = layout.offsetof(3);
        MAXSLICECOUNT = layout.offsetof(4);
        MAXPPICTUREL0REFERENCECOUNT = layout.offsetof(5);
        MAXBPICTUREL0REFERENCECOUNT = layout.offsetof(6);
        MAXL1REFERENCECOUNT = layout.offsetof(7);
        MAXTEMPORALLAYERCOUNT = layout.offsetof(8);
        EXPECTDYADICTEMPORALLAYERPATTERN = layout.offsetof(9);
        MINQP = layout.offsetof(10);
        MAXQP = layout.offsetof(11);
        PREFERSGOPREMAININGFRAMES = layout.offsetof(12);
        REQUIRESGOPREMAININGFRAMES = layout.offsetof(13);
        STDSYNTAXFLAGS = layout.offsetof(14);
    }

    protected VkVideoEncodeH264CapabilitiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH264CapabilitiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264CapabilitiesEXT(address, container);
    }

    public VkVideoEncodeH264CapabilitiesEXT(ByteBuffer container) {
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

    @NativeType("VkVideoEncodeH264CapabilityFlagsEXT")
    public int flags() {
        return nflags(address());
    }

    @NativeType("StdVideoH264LevelIdc")
    public int maxLevelIdc() {
        return nmaxLevelIdc(address());
    }

    @NativeType("uint32_t")
    public int maxSliceCount() {
        return nmaxSliceCount(address());
    }

    @NativeType("uint32_t")
    public int maxPPictureL0ReferenceCount() {
        return nmaxPPictureL0ReferenceCount(address());
    }

    @NativeType("uint32_t")
    public int maxBPictureL0ReferenceCount() {
        return nmaxBPictureL0ReferenceCount(address());
    }

    @NativeType("uint32_t")
    public int maxL1ReferenceCount() {
        return nmaxL1ReferenceCount(address());
    }

    @NativeType("uint32_t")
    public int maxTemporalLayerCount() {
        return nmaxTemporalLayerCount(address());
    }

    @NativeType("VkBool32")
    public boolean expectDyadicTemporalLayerPattern() {
        return nexpectDyadicTemporalLayerPattern(address()) != 0;
    }

    @NativeType("int32_t")
    public int minQp() {
        return nminQp(address());
    }

    @NativeType("int32_t")
    public int maxQp() {
        return nmaxQp(address());
    }

    @NativeType("VkBool32")
    public boolean prefersGopRemainingFrames() {
        return nprefersGopRemainingFrames(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean requiresGopRemainingFrames() {
        return nrequiresGopRemainingFrames(address()) != 0;
    }

    @NativeType("VkVideoEncodeH264StdFlagsEXT")
    public int stdSyntaxFlags() {
        return nstdSyntaxFlags(address());
    }

    public VkVideoEncodeH264CapabilitiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH264CapabilitiesEXT sType$Default() {
        return sType(1000038000);
    }

    public VkVideoEncodeH264CapabilitiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH264CapabilitiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkVideoEncodeH264CapabilitiesEXT set(VkVideoEncodeH264CapabilitiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH264CapabilitiesEXT malloc() {
        return new VkVideoEncodeH264CapabilitiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH264CapabilitiesEXT calloc() {
        return new VkVideoEncodeH264CapabilitiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH264CapabilitiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264CapabilitiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH264CapabilitiesEXT create(long address) {
        return new VkVideoEncodeH264CapabilitiesEXT(address, null);
    }

    @Nullable
    public static VkVideoEncodeH264CapabilitiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH264CapabilitiesEXT(address, null);
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

    public static VkVideoEncodeH264CapabilitiesEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH264CapabilitiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH264CapabilitiesEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH264CapabilitiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxLevelIdc(long struct) {
        return UNSAFE.getInt((Object) null, struct + MAXLEVELIDC);
    }

    public static int nmaxSliceCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + MAXSLICECOUNT);
    }

    public static int nmaxPPictureL0ReferenceCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + MAXPPICTUREL0REFERENCECOUNT);
    }

    public static int nmaxBPictureL0ReferenceCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + MAXBPICTUREL0REFERENCECOUNT);
    }

    public static int nmaxL1ReferenceCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + MAXL1REFERENCECOUNT);
    }

    public static int nmaxTemporalLayerCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + MAXTEMPORALLAYERCOUNT);
    }

    public static int nexpectDyadicTemporalLayerPattern(long struct) {
        return UNSAFE.getInt((Object) null, struct + EXPECTDYADICTEMPORALLAYERPATTERN);
    }

    public static int nminQp(long struct) {
        return UNSAFE.getInt((Object) null, struct + MINQP);
    }

    public static int nmaxQp(long struct) {
        return UNSAFE.getInt((Object) null, struct + MAXQP);
    }

    public static int nprefersGopRemainingFrames(long struct) {
        return UNSAFE.getInt((Object) null, struct + PREFERSGOPREMAININGFRAMES);
    }

    public static int nrequiresGopRemainingFrames(long struct) {
        return UNSAFE.getInt((Object) null, struct + REQUIRESGOPREMAININGFRAMES);
    }

    public static int nstdSyntaxFlags(long struct) {
        return UNSAFE.getInt((Object) null, struct + STDSYNTAXFLAGS);
    }

    public static void nsType(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264CapabilitiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264CapabilitiesEXT, Buffer> implements NativeResource {
        private static final VkVideoEncodeH264CapabilitiesEXT ELEMENT_FACTORY = VkVideoEncodeH264CapabilitiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH264CapabilitiesEXT.SIZEOF);
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
        public VkVideoEncodeH264CapabilitiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH264CapabilitiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkVideoEncodeH264CapabilitiesEXT.npNext(address());
        }

        @NativeType("VkVideoEncodeH264CapabilityFlagsEXT")
        public int flags() {
            return VkVideoEncodeH264CapabilitiesEXT.nflags(address());
        }

        @NativeType("StdVideoH264LevelIdc")
        public int maxLevelIdc() {
            return VkVideoEncodeH264CapabilitiesEXT.nmaxLevelIdc(address());
        }

        @NativeType("uint32_t")
        public int maxSliceCount() {
            return VkVideoEncodeH264CapabilitiesEXT.nmaxSliceCount(address());
        }

        @NativeType("uint32_t")
        public int maxPPictureL0ReferenceCount() {
            return VkVideoEncodeH264CapabilitiesEXT.nmaxPPictureL0ReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int maxBPictureL0ReferenceCount() {
            return VkVideoEncodeH264CapabilitiesEXT.nmaxBPictureL0ReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int maxL1ReferenceCount() {
            return VkVideoEncodeH264CapabilitiesEXT.nmaxL1ReferenceCount(address());
        }

        @NativeType("uint32_t")
        public int maxTemporalLayerCount() {
            return VkVideoEncodeH264CapabilitiesEXT.nmaxTemporalLayerCount(address());
        }

        @NativeType("VkBool32")
        public boolean expectDyadicTemporalLayerPattern() {
            return VkVideoEncodeH264CapabilitiesEXT.nexpectDyadicTemporalLayerPattern(address()) != 0;
        }

        @NativeType("int32_t")
        public int minQp() {
            return VkVideoEncodeH264CapabilitiesEXT.nminQp(address());
        }

        @NativeType("int32_t")
        public int maxQp() {
            return VkVideoEncodeH264CapabilitiesEXT.nmaxQp(address());
        }

        @NativeType("VkBool32")
        public boolean prefersGopRemainingFrames() {
            return VkVideoEncodeH264CapabilitiesEXT.nprefersGopRemainingFrames(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean requiresGopRemainingFrames() {
            return VkVideoEncodeH264CapabilitiesEXT.nrequiresGopRemainingFrames(address()) != 0;
        }

        @NativeType("VkVideoEncodeH264StdFlagsEXT")
        public int stdSyntaxFlags() {
            return VkVideoEncodeH264CapabilitiesEXT.nstdSyntaxFlags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH264CapabilitiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000038000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkVideoEncodeH264CapabilitiesEXT.npNext(address(), value);
            return this;
        }
    }
}
