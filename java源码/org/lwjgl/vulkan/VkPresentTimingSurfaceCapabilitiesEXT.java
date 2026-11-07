package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentTimingSurfaceCapabilitiesEXT.class */
public class VkPresentTimingSurfaceCapabilitiesEXT extends Struct<VkPresentTimingSurfaceCapabilitiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PRESENTTIMINGSUPPORTED;
    public static final int PRESENTATABSOLUTETIMESUPPORTED;
    public static final int PRESENTATRELATIVETIMESUPPORTED;
    public static final int PRESENTSTAGEQUERIES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTTIMINGSUPPORTED = layout.offsetof(2);
        PRESENTATABSOLUTETIMESUPPORTED = layout.offsetof(3);
        PRESENTATRELATIVETIMESUPPORTED = layout.offsetof(4);
        PRESENTSTAGEQUERIES = layout.offsetof(5);
    }

    protected VkPresentTimingSurfaceCapabilitiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPresentTimingSurfaceCapabilitiesEXT create(long address, ByteBuffer container) {
        return new VkPresentTimingSurfaceCapabilitiesEXT(address, container);
    }

    public VkPresentTimingSurfaceCapabilitiesEXT(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean presentTimingSupported() {
        return npresentTimingSupported(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean presentAtAbsoluteTimeSupported() {
        return npresentAtAbsoluteTimeSupported(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean presentAtRelativeTimeSupported() {
        return npresentAtRelativeTimeSupported(address()) != 0;
    }

    @NativeType("VkPresentStageFlagsEXT")
    public int presentStageQueries() {
        return npresentStageQueries(address());
    }

    public VkPresentTimingSurfaceCapabilitiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPresentTimingSurfaceCapabilitiesEXT sType$Default() {
        return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_PRESENT_TIMING_SURFACE_CAPABILITIES_EXT);
    }

    public VkPresentTimingSurfaceCapabilitiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPresentTimingSurfaceCapabilitiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPresentTimingSurfaceCapabilitiesEXT set(VkPresentTimingSurfaceCapabilitiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPresentTimingSurfaceCapabilitiesEXT malloc() {
        return new VkPresentTimingSurfaceCapabilitiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPresentTimingSurfaceCapabilitiesEXT calloc() {
        return new VkPresentTimingSurfaceCapabilitiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPresentTimingSurfaceCapabilitiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPresentTimingSurfaceCapabilitiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPresentTimingSurfaceCapabilitiesEXT create(long address) {
        return new VkPresentTimingSurfaceCapabilitiesEXT(address, null);
    }

    public static VkPresentTimingSurfaceCapabilitiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPresentTimingSurfaceCapabilitiesEXT(address, null);
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

    public static VkPresentTimingSurfaceCapabilitiesEXT malloc(MemoryStack stack) {
        return new VkPresentTimingSurfaceCapabilitiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPresentTimingSurfaceCapabilitiesEXT calloc(MemoryStack stack) {
        return new VkPresentTimingSurfaceCapabilitiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npresentTimingSupported(long struct) {
        return MemoryUtil.memGetInt(struct + PRESENTTIMINGSUPPORTED);
    }

    public static int npresentAtAbsoluteTimeSupported(long struct) {
        return MemoryUtil.memGetInt(struct + PRESENTATABSOLUTETIMESUPPORTED);
    }

    public static int npresentAtRelativeTimeSupported(long struct) {
        return MemoryUtil.memGetInt(struct + PRESENTATRELATIVETIMESUPPORTED);
    }

    public static int npresentStageQueries(long struct) {
        return MemoryUtil.memGetInt(struct + PRESENTSTAGEQUERIES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentTimingSurfaceCapabilitiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPresentTimingSurfaceCapabilitiesEXT, Buffer> implements NativeResource {
        private static final VkPresentTimingSurfaceCapabilitiesEXT ELEMENT_FACTORY = VkPresentTimingSurfaceCapabilitiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPresentTimingSurfaceCapabilitiesEXT.SIZEOF);
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
        public VkPresentTimingSurfaceCapabilitiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPresentTimingSurfaceCapabilitiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPresentTimingSurfaceCapabilitiesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean presentTimingSupported() {
            return VkPresentTimingSurfaceCapabilitiesEXT.npresentTimingSupported(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean presentAtAbsoluteTimeSupported() {
            return VkPresentTimingSurfaceCapabilitiesEXT.npresentAtAbsoluteTimeSupported(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean presentAtRelativeTimeSupported() {
            return VkPresentTimingSurfaceCapabilitiesEXT.npresentAtRelativeTimeSupported(address()) != 0;
        }

        @NativeType("VkPresentStageFlagsEXT")
        public int presentStageQueries() {
            return VkPresentTimingSurfaceCapabilitiesEXT.npresentStageQueries(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPresentTimingSurfaceCapabilitiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_PRESENT_TIMING_SURFACE_CAPABILITIES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPresentTimingSurfaceCapabilitiesEXT.npNext(address(), value);
            return this;
        }
    }
}
