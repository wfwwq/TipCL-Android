package org.lwjgl.util.vma;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaBudget.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaBudget.class */
public class VmaBudget extends Struct<VmaBudget> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STATISTICS;
    public static final int USAGE;
    public static final int BUDGET;

    static {
        Struct.Layout layout = __struct(__member(VmaStatistics.SIZEOF, VmaStatistics.ALIGNOF), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STATISTICS = layout.offsetof(0);
        USAGE = layout.offsetof(1);
        BUDGET = layout.offsetof(2);
    }

    protected VmaBudget(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VmaBudget create(long address, ByteBuffer container) {
        return new VmaBudget(address, container);
    }

    public VmaBudget(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public VmaStatistics statistics() {
        return nstatistics(address());
    }

    @NativeType("VkDeviceSize")
    public long usage() {
        return nusage(address());
    }

    @NativeType("VkDeviceSize")
    public long budget() {
        return nbudget(address());
    }

    public static VmaBudget malloc() {
        return new VmaBudget(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VmaBudget calloc() {
        return new VmaBudget(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VmaBudget create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaBudget(MemoryUtil.memAddress(container), container);
    }

    public static VmaBudget create(long address) {
        return new VmaBudget(address, null);
    }

    public static VmaBudget createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VmaBudget(address, null);
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

    public static VmaBudget malloc(MemoryStack stack) {
        return new VmaBudget(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VmaBudget calloc(MemoryStack stack) {
        return new VmaBudget(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VmaStatistics nstatistics(long struct) {
        return VmaStatistics.create(struct + STATISTICS);
    }

    public static long nusage(long struct) {
        return MemoryUtil.memGetLong(struct + USAGE);
    }

    public static long nbudget(long struct) {
        return MemoryUtil.memGetLong(struct + BUDGET);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaBudget$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaBudget$Buffer.class */
    public static class Buffer extends StructBuffer<VmaBudget, Buffer> implements NativeResource {
        private static final VmaBudget ELEMENT_FACTORY = VmaBudget.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VmaBudget.SIZEOF);
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
        public VmaBudget getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public VmaStatistics statistics() {
            return VmaBudget.nstatistics(address());
        }

        @NativeType("VkDeviceSize")
        public long usage() {
            return VmaBudget.nusage(address());
        }

        @NativeType("VkDeviceSize")
        public long budget() {
            return VmaBudget.nbudget(address());
        }
    }
}
