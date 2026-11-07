package org.lwjgl.util.vma;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.util.vma.VmaDetailedStatistics;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaTotalStatistics.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaTotalStatistics.class */
public class VmaTotalStatistics extends Struct<VmaTotalStatistics> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MEMORYTYPE;
    public static final int MEMORYHEAP;
    public static final int TOTAL;

    static {
        Struct.Layout layout = __struct(__array(VmaDetailedStatistics.SIZEOF, VmaDetailedStatistics.ALIGNOF, 32), __array(VmaDetailedStatistics.SIZEOF, VmaDetailedStatistics.ALIGNOF, 16), __member(VmaDetailedStatistics.SIZEOF, VmaDetailedStatistics.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MEMORYTYPE = layout.offsetof(0);
        MEMORYHEAP = layout.offsetof(1);
        TOTAL = layout.offsetof(2);
    }

    protected VmaTotalStatistics(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VmaTotalStatistics create(long address, ByteBuffer container) {
        return new VmaTotalStatistics(address, container);
    }

    public VmaTotalStatistics(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VmaDetailedStatistics[32]")
    public VmaDetailedStatistics.Buffer memoryType() {
        return nmemoryType(address());
    }

    public VmaDetailedStatistics memoryType(int index) {
        return nmemoryType(address(), index);
    }

    @NativeType("VmaDetailedStatistics[16]")
    public VmaDetailedStatistics.Buffer memoryHeap() {
        return nmemoryHeap(address());
    }

    public VmaDetailedStatistics memoryHeap(int index) {
        return nmemoryHeap(address(), index);
    }

    public VmaDetailedStatistics total() {
        return ntotal(address());
    }

    public static VmaTotalStatistics malloc() {
        return new VmaTotalStatistics(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VmaTotalStatistics calloc() {
        return new VmaTotalStatistics(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VmaTotalStatistics create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaTotalStatistics(MemoryUtil.memAddress(container), container);
    }

    public static VmaTotalStatistics create(long address) {
        return new VmaTotalStatistics(address, null);
    }

    public static VmaTotalStatistics createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VmaTotalStatistics(address, null);
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

    public static VmaTotalStatistics malloc(MemoryStack stack) {
        return new VmaTotalStatistics(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VmaTotalStatistics calloc(MemoryStack stack) {
        return new VmaTotalStatistics(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VmaDetailedStatistics.Buffer nmemoryType(long struct) {
        return VmaDetailedStatistics.create(struct + MEMORYTYPE, 32);
    }

    public static VmaDetailedStatistics nmemoryType(long struct, int index) {
        return VmaDetailedStatistics.create(struct + MEMORYTYPE + (Checks.check(index, 32) * VmaDetailedStatistics.SIZEOF));
    }

    public static VmaDetailedStatistics.Buffer nmemoryHeap(long struct) {
        return VmaDetailedStatistics.create(struct + MEMORYHEAP, 16);
    }

    public static VmaDetailedStatistics nmemoryHeap(long struct, int index) {
        return VmaDetailedStatistics.create(struct + MEMORYHEAP + (Checks.check(index, 16) * VmaDetailedStatistics.SIZEOF));
    }

    public static VmaDetailedStatistics ntotal(long struct) {
        return VmaDetailedStatistics.create(struct + TOTAL);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaTotalStatistics$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaTotalStatistics$Buffer.class */
    public static class Buffer extends StructBuffer<VmaTotalStatistics, Buffer> implements NativeResource {
        private static final VmaTotalStatistics ELEMENT_FACTORY = VmaTotalStatistics.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VmaTotalStatistics.SIZEOF);
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
        public VmaTotalStatistics getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VmaDetailedStatistics[32]")
        public VmaDetailedStatistics.Buffer memoryType() {
            return VmaTotalStatistics.nmemoryType(address());
        }

        public VmaDetailedStatistics memoryType(int index) {
            return VmaTotalStatistics.nmemoryType(address(), index);
        }

        @NativeType("VmaDetailedStatistics[16]")
        public VmaDetailedStatistics.Buffer memoryHeap() {
            return VmaTotalStatistics.nmemoryHeap(address());
        }

        public VmaDetailedStatistics memoryHeap(int index) {
            return VmaTotalStatistics.nmemoryHeap(address(), index);
        }

        public VmaDetailedStatistics total() {
            return VmaTotalStatistics.ntotal(address());
        }
    }
}
