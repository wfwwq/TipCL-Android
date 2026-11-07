package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkPastPresentationTimingEXT;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPastPresentationTimingPropertiesEXT.class */
public class VkPastPresentationTimingPropertiesEXT extends Struct<VkPastPresentationTimingPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TIMINGPROPERTIESCOUNTER;
    public static final int TIMEDOMAINSCOUNTER;
    public static final int PRESENTATIONTIMINGCOUNT;
    public static final int PPRESENTATIONTIMINGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TIMINGPROPERTIESCOUNTER = layout.offsetof(2);
        TIMEDOMAINSCOUNTER = layout.offsetof(3);
        PRESENTATIONTIMINGCOUNT = layout.offsetof(4);
        PPRESENTATIONTIMINGS = layout.offsetof(5);
    }

    protected VkPastPresentationTimingPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPastPresentationTimingPropertiesEXT create(long address, ByteBuffer container) {
        return new VkPastPresentationTimingPropertiesEXT(address, container);
    }

    public VkPastPresentationTimingPropertiesEXT(ByteBuffer container) {
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
    public long timingPropertiesCounter() {
        return ntimingPropertiesCounter(address());
    }

    @NativeType("uint64_t")
    public long timeDomainsCounter() {
        return ntimeDomainsCounter(address());
    }

    @NativeType("uint32_t")
    public int presentationTimingCount() {
        return npresentationTimingCount(address());
    }

    @NativeType("VkPastPresentationTimingEXT *")
    public VkPastPresentationTimingEXT.Buffer pPresentationTimings() {
        return npPresentationTimings(address());
    }

    public VkPastPresentationTimingPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPastPresentationTimingPropertiesEXT sType$Default() {
        return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_PROPERTIES_EXT);
    }

    public VkPastPresentationTimingPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPastPresentationTimingPropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPastPresentationTimingPropertiesEXT set(VkPastPresentationTimingPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPastPresentationTimingPropertiesEXT malloc() {
        return new VkPastPresentationTimingPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPastPresentationTimingPropertiesEXT calloc() {
        return new VkPastPresentationTimingPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPastPresentationTimingPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPastPresentationTimingPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPastPresentationTimingPropertiesEXT create(long address) {
        return new VkPastPresentationTimingPropertiesEXT(address, null);
    }

    public static VkPastPresentationTimingPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPastPresentationTimingPropertiesEXT(address, null);
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

    public static VkPastPresentationTimingPropertiesEXT malloc(MemoryStack stack) {
        return new VkPastPresentationTimingPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPastPresentationTimingPropertiesEXT calloc(MemoryStack stack) {
        return new VkPastPresentationTimingPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ntimingPropertiesCounter(long struct) {
        return MemoryUtil.memGetLong(struct + TIMINGPROPERTIESCOUNTER);
    }

    public static long ntimeDomainsCounter(long struct) {
        return MemoryUtil.memGetLong(struct + TIMEDOMAINSCOUNTER);
    }

    public static int npresentationTimingCount(long struct) {
        return MemoryUtil.memGetInt(struct + PRESENTATIONTIMINGCOUNT);
    }

    public static VkPastPresentationTimingEXT.Buffer npPresentationTimings(long struct) {
        return VkPastPresentationTimingEXT.create(MemoryUtil.memGetAddress(struct + PPRESENTATIONTIMINGS), npresentationTimingCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPastPresentationTimingPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPastPresentationTimingPropertiesEXT, Buffer> implements NativeResource {
        private static final VkPastPresentationTimingPropertiesEXT ELEMENT_FACTORY = VkPastPresentationTimingPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPastPresentationTimingPropertiesEXT.SIZEOF);
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
        public VkPastPresentationTimingPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPastPresentationTimingPropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPastPresentationTimingPropertiesEXT.npNext(address());
        }

        @NativeType("uint64_t")
        public long timingPropertiesCounter() {
            return VkPastPresentationTimingPropertiesEXT.ntimingPropertiesCounter(address());
        }

        @NativeType("uint64_t")
        public long timeDomainsCounter() {
            return VkPastPresentationTimingPropertiesEXT.ntimeDomainsCounter(address());
        }

        @NativeType("uint32_t")
        public int presentationTimingCount() {
            return VkPastPresentationTimingPropertiesEXT.npresentationTimingCount(address());
        }

        @NativeType("VkPastPresentationTimingEXT *")
        public VkPastPresentationTimingEXT.Buffer pPresentationTimings() {
            return VkPastPresentationTimingPropertiesEXT.npPresentationTimings(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPastPresentationTimingPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_PROPERTIES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPastPresentationTimingPropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
