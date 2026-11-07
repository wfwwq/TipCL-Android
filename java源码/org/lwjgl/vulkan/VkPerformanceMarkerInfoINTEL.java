package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceMarkerInfoINTEL.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceMarkerInfoINTEL.class */
public class VkPerformanceMarkerInfoINTEL extends Struct<VkPerformanceMarkerInfoINTEL> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MARKER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MARKER = layout.offsetof(2);
    }

    protected VkPerformanceMarkerInfoINTEL(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPerformanceMarkerInfoINTEL create(long address, ByteBuffer container) {
        return new VkPerformanceMarkerInfoINTEL(address, container);
    }

    public VkPerformanceMarkerInfoINTEL(ByteBuffer container) {
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

    @NativeType("uint64_t")
    public long marker() {
        return nmarker(address());
    }

    public VkPerformanceMarkerInfoINTEL sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPerformanceMarkerInfoINTEL sType$Default() {
        return sType(INTELPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_MARKER_INFO_INTEL);
    }

    public VkPerformanceMarkerInfoINTEL pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPerformanceMarkerInfoINTEL marker(@NativeType("uint64_t") long value) {
        nmarker(address(), value);
        return this;
    }

    public VkPerformanceMarkerInfoINTEL set(int sType, long pNext, long marker) {
        sType(sType);
        pNext(pNext);
        marker(marker);
        return this;
    }

    public VkPerformanceMarkerInfoINTEL set(VkPerformanceMarkerInfoINTEL src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPerformanceMarkerInfoINTEL malloc() {
        return new VkPerformanceMarkerInfoINTEL(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPerformanceMarkerInfoINTEL calloc() {
        return new VkPerformanceMarkerInfoINTEL(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPerformanceMarkerInfoINTEL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPerformanceMarkerInfoINTEL(MemoryUtil.memAddress(container), container);
    }

    public static VkPerformanceMarkerInfoINTEL create(long address) {
        return new VkPerformanceMarkerInfoINTEL(address, null);
    }

    public static VkPerformanceMarkerInfoINTEL createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPerformanceMarkerInfoINTEL(address, null);
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

    public static VkPerformanceMarkerInfoINTEL malloc(MemoryStack stack) {
        return new VkPerformanceMarkerInfoINTEL(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPerformanceMarkerInfoINTEL calloc(MemoryStack stack) {
        return new VkPerformanceMarkerInfoINTEL(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nmarker(long struct) {
        return MemoryUtil.memGetLong(struct + MARKER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmarker(long struct, long value) {
        MemoryUtil.memPutLong(struct + MARKER, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceMarkerInfoINTEL$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceMarkerInfoINTEL$Buffer.class */
    public static class Buffer extends StructBuffer<VkPerformanceMarkerInfoINTEL, Buffer> implements NativeResource {
        private static final VkPerformanceMarkerInfoINTEL ELEMENT_FACTORY = VkPerformanceMarkerInfoINTEL.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPerformanceMarkerInfoINTEL.SIZEOF);
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
        public VkPerformanceMarkerInfoINTEL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPerformanceMarkerInfoINTEL.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPerformanceMarkerInfoINTEL.npNext(address());
        }

        @NativeType("uint64_t")
        public long marker() {
            return VkPerformanceMarkerInfoINTEL.nmarker(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPerformanceMarkerInfoINTEL.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(INTELPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_MARKER_INFO_INTEL);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPerformanceMarkerInfoINTEL.npNext(address(), value);
            return this;
        }

        public Buffer marker(@NativeType("uint64_t") long value) {
            VkPerformanceMarkerInfoINTEL.nmarker(address(), value);
            return this;
        }
    }
}
