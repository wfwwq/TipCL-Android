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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceStreamMarkerInfoINTEL.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceStreamMarkerInfoINTEL.class */
public class VkPerformanceStreamMarkerInfoINTEL extends Struct<VkPerformanceStreamMarkerInfoINTEL> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MARKER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MARKER = layout.offsetof(2);
    }

    protected VkPerformanceStreamMarkerInfoINTEL(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPerformanceStreamMarkerInfoINTEL create(long address, ByteBuffer container) {
        return new VkPerformanceStreamMarkerInfoINTEL(address, container);
    }

    public VkPerformanceStreamMarkerInfoINTEL(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int marker() {
        return nmarker(address());
    }

    public VkPerformanceStreamMarkerInfoINTEL sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPerformanceStreamMarkerInfoINTEL sType$Default() {
        return sType(INTELPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL);
    }

    public VkPerformanceStreamMarkerInfoINTEL pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPerformanceStreamMarkerInfoINTEL marker(@NativeType("uint32_t") int value) {
        nmarker(address(), value);
        return this;
    }

    public VkPerformanceStreamMarkerInfoINTEL set(int sType, long pNext, int marker) {
        sType(sType);
        pNext(pNext);
        marker(marker);
        return this;
    }

    public VkPerformanceStreamMarkerInfoINTEL set(VkPerformanceStreamMarkerInfoINTEL src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPerformanceStreamMarkerInfoINTEL malloc() {
        return new VkPerformanceStreamMarkerInfoINTEL(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPerformanceStreamMarkerInfoINTEL calloc() {
        return new VkPerformanceStreamMarkerInfoINTEL(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPerformanceStreamMarkerInfoINTEL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPerformanceStreamMarkerInfoINTEL(MemoryUtil.memAddress(container), container);
    }

    public static VkPerformanceStreamMarkerInfoINTEL create(long address) {
        return new VkPerformanceStreamMarkerInfoINTEL(address, null);
    }

    public static VkPerformanceStreamMarkerInfoINTEL createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPerformanceStreamMarkerInfoINTEL(address, null);
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

    public static VkPerformanceStreamMarkerInfoINTEL malloc(MemoryStack stack) {
        return new VkPerformanceStreamMarkerInfoINTEL(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPerformanceStreamMarkerInfoINTEL calloc(MemoryStack stack) {
        return new VkPerformanceStreamMarkerInfoINTEL(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmarker(long struct) {
        return MemoryUtil.memGetInt(struct + MARKER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmarker(long struct, int value) {
        MemoryUtil.memPutInt(struct + MARKER, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceStreamMarkerInfoINTEL$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceStreamMarkerInfoINTEL$Buffer.class */
    public static class Buffer extends StructBuffer<VkPerformanceStreamMarkerInfoINTEL, Buffer> implements NativeResource {
        private static final VkPerformanceStreamMarkerInfoINTEL ELEMENT_FACTORY = VkPerformanceStreamMarkerInfoINTEL.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPerformanceStreamMarkerInfoINTEL.SIZEOF);
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
        public VkPerformanceStreamMarkerInfoINTEL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPerformanceStreamMarkerInfoINTEL.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPerformanceStreamMarkerInfoINTEL.npNext(address());
        }

        @NativeType("uint32_t")
        public int marker() {
            return VkPerformanceStreamMarkerInfoINTEL.nmarker(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPerformanceStreamMarkerInfoINTEL.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(INTELPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPerformanceStreamMarkerInfoINTEL.npNext(address(), value);
            return this;
        }

        public Buffer marker(@NativeType("uint32_t") int value) {
            VkPerformanceStreamMarkerInfoINTEL.nmarker(address(), value);
            return this;
        }
    }
}
