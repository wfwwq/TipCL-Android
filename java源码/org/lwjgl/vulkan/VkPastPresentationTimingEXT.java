package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkPresentStageTimeEXT;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPastPresentationTimingEXT.class */
public class VkPastPresentationTimingEXT extends Struct<VkPastPresentationTimingEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PRESENTID;
    public static final int TARGETTIME;
    public static final int PRESENTSTAGECOUNT;
    public static final int PPRESENTSTAGES;
    public static final int TIMEDOMAIN;
    public static final int TIMEDOMAINID;
    public static final int REPORTCOMPLETE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTID = layout.offsetof(2);
        TARGETTIME = layout.offsetof(3);
        PRESENTSTAGECOUNT = layout.offsetof(4);
        PPRESENTSTAGES = layout.offsetof(5);
        TIMEDOMAIN = layout.offsetof(6);
        TIMEDOMAINID = layout.offsetof(7);
        REPORTCOMPLETE = layout.offsetof(8);
    }

    protected VkPastPresentationTimingEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPastPresentationTimingEXT create(long address, ByteBuffer container) {
        return new VkPastPresentationTimingEXT(address, container);
    }

    public VkPastPresentationTimingEXT(ByteBuffer container) {
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

    @NativeType("uint64_t")
    public long presentId() {
        return npresentId(address());
    }

    @NativeType("uint64_t")
    public long targetTime() {
        return ntargetTime(address());
    }

    @NativeType("uint32_t")
    public int presentStageCount() {
        return npresentStageCount(address());
    }

    @NativeType("VkPresentStageTimeEXT *")
    public VkPresentStageTimeEXT.Buffer pPresentStages() {
        return npPresentStages(address());
    }

    @NativeType("VkTimeDomainKHR")
    public int timeDomain() {
        return ntimeDomain(address());
    }

    @NativeType("uint64_t")
    public long timeDomainId() {
        return ntimeDomainId(address());
    }

    @NativeType("VkBool32")
    public boolean reportComplete() {
        return nreportComplete(address()) != 0;
    }

    public VkPastPresentationTimingEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPastPresentationTimingEXT sType$Default() {
        return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_EXT);
    }

    public VkPastPresentationTimingEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPastPresentationTimingEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPastPresentationTimingEXT set(VkPastPresentationTimingEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPastPresentationTimingEXT malloc() {
        return new VkPastPresentationTimingEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPastPresentationTimingEXT calloc() {
        return new VkPastPresentationTimingEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPastPresentationTimingEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPastPresentationTimingEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPastPresentationTimingEXT create(long address) {
        return new VkPastPresentationTimingEXT(address, null);
    }

    public static VkPastPresentationTimingEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPastPresentationTimingEXT(address, null);
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

    public static VkPastPresentationTimingEXT malloc(MemoryStack stack) {
        return new VkPastPresentationTimingEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPastPresentationTimingEXT calloc(MemoryStack stack) {
        return new VkPastPresentationTimingEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long npresentId(long struct) {
        return MemoryUtil.memGetLong(struct + PRESENTID);
    }

    public static long ntargetTime(long struct) {
        return MemoryUtil.memGetLong(struct + TARGETTIME);
    }

    public static int npresentStageCount(long struct) {
        return MemoryUtil.memGetInt(struct + PRESENTSTAGECOUNT);
    }

    public static VkPresentStageTimeEXT.Buffer npPresentStages(long struct) {
        return VkPresentStageTimeEXT.create(MemoryUtil.memGetAddress(struct + PPRESENTSTAGES), npresentStageCount(struct));
    }

    public static int ntimeDomain(long struct) {
        return MemoryUtil.memGetInt(struct + TIMEDOMAIN);
    }

    public static long ntimeDomainId(long struct) {
        return MemoryUtil.memGetLong(struct + TIMEDOMAINID);
    }

    public static int nreportComplete(long struct) {
        return MemoryUtil.memGetInt(struct + REPORTCOMPLETE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPastPresentationTimingEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPastPresentationTimingEXT, Buffer> implements NativeResource {
        private static final VkPastPresentationTimingEXT ELEMENT_FACTORY = VkPastPresentationTimingEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPastPresentationTimingEXT.SIZEOF);
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
        public VkPastPresentationTimingEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPastPresentationTimingEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPastPresentationTimingEXT.npNext(address());
        }

        @NativeType("uint64_t")
        public long presentId() {
            return VkPastPresentationTimingEXT.npresentId(address());
        }

        @NativeType("uint64_t")
        public long targetTime() {
            return VkPastPresentationTimingEXT.ntargetTime(address());
        }

        @NativeType("uint32_t")
        public int presentStageCount() {
            return VkPastPresentationTimingEXT.npresentStageCount(address());
        }

        @NativeType("VkPresentStageTimeEXT *")
        public VkPresentStageTimeEXT.Buffer pPresentStages() {
            return VkPastPresentationTimingEXT.npPresentStages(address());
        }

        @NativeType("VkTimeDomainKHR")
        public int timeDomain() {
            return VkPastPresentationTimingEXT.ntimeDomain(address());
        }

        @NativeType("uint64_t")
        public long timeDomainId() {
            return VkPastPresentationTimingEXT.ntimeDomainId(address());
        }

        @NativeType("VkBool32")
        public boolean reportComplete() {
            return VkPastPresentationTimingEXT.nreportComplete(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPastPresentationTimingEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPastPresentationTimingEXT.npNext(address(), value);
            return this;
        }
    }
}
