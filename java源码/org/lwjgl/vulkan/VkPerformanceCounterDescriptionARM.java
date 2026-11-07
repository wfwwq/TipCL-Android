package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceCounterDescriptionARM.class */
public class VkPerformanceCounterDescriptionARM extends Struct<VkPerformanceCounterDescriptionARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int NAME;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __array(1, 256));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        NAME = layout.offsetof(3);
    }

    protected VkPerformanceCounterDescriptionARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPerformanceCounterDescriptionARM create(long address, ByteBuffer container) {
        return new VkPerformanceCounterDescriptionARM(address, container);
    }

    public VkPerformanceCounterDescriptionARM(ByteBuffer container) {
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

    @NativeType("VkPerformanceCounterDescriptionFlagsARM")
    public int flags() {
        return nflags(address());
    }

    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer name() {
        return nname(address());
    }

    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String nameString() {
        return nnameString(address());
    }

    public VkPerformanceCounterDescriptionARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPerformanceCounterDescriptionARM sType$Default() {
        return sType(ARMPerformanceCountersByRegion.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_ARM);
    }

    public VkPerformanceCounterDescriptionARM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPerformanceCounterDescriptionARM set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPerformanceCounterDescriptionARM set(VkPerformanceCounterDescriptionARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPerformanceCounterDescriptionARM malloc() {
        return new VkPerformanceCounterDescriptionARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPerformanceCounterDescriptionARM calloc() {
        return new VkPerformanceCounterDescriptionARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPerformanceCounterDescriptionARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPerformanceCounterDescriptionARM(MemoryUtil.memAddress(container), container);
    }

    public static VkPerformanceCounterDescriptionARM create(long address) {
        return new VkPerformanceCounterDescriptionARM(address, null);
    }

    public static VkPerformanceCounterDescriptionARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPerformanceCounterDescriptionARM(address, null);
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

    public static VkPerformanceCounterDescriptionARM malloc(MemoryStack stack) {
        return new VkPerformanceCounterDescriptionARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPerformanceCounterDescriptionARM calloc(MemoryStack stack) {
        return new VkPerformanceCounterDescriptionARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static ByteBuffer nname(long struct) {
        return MemoryUtil.memByteBuffer(struct + NAME, 256);
    }

    public static String nnameString(long struct) {
        return MemoryUtil.memUTF8(struct + NAME);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceCounterDescriptionARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPerformanceCounterDescriptionARM, Buffer> implements NativeResource {
        private static final VkPerformanceCounterDescriptionARM ELEMENT_FACTORY = VkPerformanceCounterDescriptionARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPerformanceCounterDescriptionARM.SIZEOF);
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
        public VkPerformanceCounterDescriptionARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPerformanceCounterDescriptionARM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPerformanceCounterDescriptionARM.npNext(address());
        }

        @NativeType("VkPerformanceCounterDescriptionFlagsARM")
        public int flags() {
            return VkPerformanceCounterDescriptionARM.nflags(address());
        }

        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer name() {
            return VkPerformanceCounterDescriptionARM.nname(address());
        }

        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String nameString() {
            return VkPerformanceCounterDescriptionARM.nnameString(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPerformanceCounterDescriptionARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMPerformanceCountersByRegion.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_ARM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPerformanceCounterDescriptionARM.npNext(address(), value);
            return this;
        }
    }
}
