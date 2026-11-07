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

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaDefragmentationMove.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaDefragmentationMove.class */
public class VmaDefragmentationMove extends Struct<VmaDefragmentationMove> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int OPERATION;
    public static final int SRCALLOCATION;
    public static final int DSTTMPALLOCATION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        OPERATION = layout.offsetof(0);
        SRCALLOCATION = layout.offsetof(1);
        DSTTMPALLOCATION = layout.offsetof(2);
    }

    protected VmaDefragmentationMove(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VmaDefragmentationMove create(long address, ByteBuffer container) {
        return new VmaDefragmentationMove(address, container);
    }

    public VmaDefragmentationMove(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VmaDefragmentationMoveOperation")
    public int operation() {
        return noperation(address());
    }

    @NativeType("VmaAllocation")
    public long srcAllocation() {
        return nsrcAllocation(address());
    }

    @NativeType("VmaAllocation")
    public long dstTmpAllocation() {
        return ndstTmpAllocation(address());
    }

    public VmaDefragmentationMove operation(@NativeType("VmaDefragmentationMoveOperation") int value) {
        noperation(address(), value);
        return this;
    }

    public VmaDefragmentationMove srcAllocation(@NativeType("VmaAllocation") long value) {
        nsrcAllocation(address(), value);
        return this;
    }

    public VmaDefragmentationMove dstTmpAllocation(@NativeType("VmaAllocation") long value) {
        ndstTmpAllocation(address(), value);
        return this;
    }

    public VmaDefragmentationMove set(int operation, long srcAllocation, long dstTmpAllocation) {
        operation(operation);
        srcAllocation(srcAllocation);
        dstTmpAllocation(dstTmpAllocation);
        return this;
    }

    public VmaDefragmentationMove set(VmaDefragmentationMove src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VmaDefragmentationMove malloc() {
        return new VmaDefragmentationMove(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VmaDefragmentationMove calloc() {
        return new VmaDefragmentationMove(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VmaDefragmentationMove create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaDefragmentationMove(MemoryUtil.memAddress(container), container);
    }

    public static VmaDefragmentationMove create(long address) {
        return new VmaDefragmentationMove(address, null);
    }

    public static VmaDefragmentationMove createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VmaDefragmentationMove(address, null);
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

    public static VmaDefragmentationMove malloc(MemoryStack stack) {
        return new VmaDefragmentationMove(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VmaDefragmentationMove calloc(MemoryStack stack) {
        return new VmaDefragmentationMove(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int noperation(long struct) {
        return MemoryUtil.memGetInt(struct + OPERATION);
    }

    public static long nsrcAllocation(long struct) {
        return MemoryUtil.memGetAddress(struct + SRCALLOCATION);
    }

    public static long ndstTmpAllocation(long struct) {
        return MemoryUtil.memGetAddress(struct + DSTTMPALLOCATION);
    }

    public static void noperation(long struct, int value) {
        MemoryUtil.memPutInt(struct + OPERATION, value);
    }

    public static void nsrcAllocation(long struct, long value) {
        MemoryUtil.memPutAddress(struct + SRCALLOCATION, Checks.check(value));
    }

    public static void ndstTmpAllocation(long struct, long value) {
        MemoryUtil.memPutAddress(struct + DSTTMPALLOCATION, Checks.check(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + SRCALLOCATION));
        Checks.check(MemoryUtil.memGetAddress(struct + DSTTMPALLOCATION));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaDefragmentationMove$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaDefragmentationMove$Buffer.class */
    public static class Buffer extends StructBuffer<VmaDefragmentationMove, Buffer> implements NativeResource {
        private static final VmaDefragmentationMove ELEMENT_FACTORY = VmaDefragmentationMove.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VmaDefragmentationMove.SIZEOF);
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
        public VmaDefragmentationMove getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VmaDefragmentationMoveOperation")
        public int operation() {
            return VmaDefragmentationMove.noperation(address());
        }

        @NativeType("VmaAllocation")
        public long srcAllocation() {
            return VmaDefragmentationMove.nsrcAllocation(address());
        }

        @NativeType("VmaAllocation")
        public long dstTmpAllocation() {
            return VmaDefragmentationMove.ndstTmpAllocation(address());
        }

        public Buffer operation(@NativeType("VmaDefragmentationMoveOperation") int value) {
            VmaDefragmentationMove.noperation(address(), value);
            return this;
        }

        public Buffer srcAllocation(@NativeType("VmaAllocation") long value) {
            VmaDefragmentationMove.nsrcAllocation(address(), value);
            return this;
        }

        public Buffer dstTmpAllocation(@NativeType("VmaAllocation") long value) {
            VmaDefragmentationMove.ndstTmpAllocation(address(), value);
            return this;
        }
    }
}
