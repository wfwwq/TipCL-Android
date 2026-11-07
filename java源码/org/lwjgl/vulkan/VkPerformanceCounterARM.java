package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceCounterARM.class */
public class VkPerformanceCounterARM extends Struct<VkPerformanceCounterARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COUNTERID;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COUNTERID = layout.offsetof(2);
    }

    protected VkPerformanceCounterARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPerformanceCounterARM create(long address, ByteBuffer container) {
        return new VkPerformanceCounterARM(address, container);
    }

    public VkPerformanceCounterARM(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int counterID() {
        return ncounterID(address());
    }

    public VkPerformanceCounterARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPerformanceCounterARM sType$Default() {
        return sType(ARMPerformanceCountersByRegion.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_ARM);
    }

    public VkPerformanceCounterARM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPerformanceCounterARM set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPerformanceCounterARM set(VkPerformanceCounterARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPerformanceCounterARM malloc() {
        return new VkPerformanceCounterARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPerformanceCounterARM calloc() {
        return new VkPerformanceCounterARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPerformanceCounterARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPerformanceCounterARM(MemoryUtil.memAddress(container), container);
    }

    public static VkPerformanceCounterARM create(long address) {
        return new VkPerformanceCounterARM(address, null);
    }

    public static VkPerformanceCounterARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPerformanceCounterARM(address, null);
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

    public static VkPerformanceCounterARM malloc(MemoryStack stack) {
        return new VkPerformanceCounterARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPerformanceCounterARM calloc(MemoryStack stack) {
        return new VkPerformanceCounterARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncounterID(long struct) {
        return MemoryUtil.memGetInt(struct + COUNTERID);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceCounterARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPerformanceCounterARM, Buffer> implements NativeResource {
        private static final VkPerformanceCounterARM ELEMENT_FACTORY = VkPerformanceCounterARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPerformanceCounterARM.SIZEOF);
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
        public VkPerformanceCounterARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPerformanceCounterARM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPerformanceCounterARM.npNext(address());
        }

        @NativeType("uint32_t")
        public int counterID() {
            return VkPerformanceCounterARM.ncounterID(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPerformanceCounterARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMPerformanceCountersByRegion.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_ARM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPerformanceCounterARM.npNext(address(), value);
            return this;
        }
    }
}
