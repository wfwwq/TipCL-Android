package org.lwjgl.util.vma;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.util.vma.VmaDefragmentationMove;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaDefragmentationPassMoveInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaDefragmentationPassMoveInfo.class */
public class VmaDefragmentationPassMoveInfo extends Struct<VmaDefragmentationPassMoveInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MOVECOUNT;
    public static final int PMOVES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MOVECOUNT = layout.offsetof(0);
        PMOVES = layout.offsetof(1);
    }

    protected VmaDefragmentationPassMoveInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VmaDefragmentationPassMoveInfo create(long address, ByteBuffer container) {
        return new VmaDefragmentationPassMoveInfo(address, container);
    }

    public VmaDefragmentationPassMoveInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int moveCount() {
        return nmoveCount(address());
    }

    @NativeType("VmaDefragmentationMove *")
    public VmaDefragmentationMove.Buffer pMoves() {
        return npMoves(address());
    }

    public VmaDefragmentationPassMoveInfo moveCount(@NativeType("uint32_t") int value) {
        nmoveCount(address(), value);
        return this;
    }

    public VmaDefragmentationPassMoveInfo pMoves(@NativeType("VmaDefragmentationMove *") VmaDefragmentationMove.Buffer value) {
        npMoves(address(), value);
        return this;
    }

    public VmaDefragmentationPassMoveInfo set(int moveCount, VmaDefragmentationMove.Buffer pMoves) {
        moveCount(moveCount);
        pMoves(pMoves);
        return this;
    }

    public VmaDefragmentationPassMoveInfo set(VmaDefragmentationPassMoveInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VmaDefragmentationPassMoveInfo malloc() {
        return new VmaDefragmentationPassMoveInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VmaDefragmentationPassMoveInfo calloc() {
        return new VmaDefragmentationPassMoveInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VmaDefragmentationPassMoveInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaDefragmentationPassMoveInfo(MemoryUtil.memAddress(container), container);
    }

    public static VmaDefragmentationPassMoveInfo create(long address) {
        return new VmaDefragmentationPassMoveInfo(address, null);
    }

    public static VmaDefragmentationPassMoveInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VmaDefragmentationPassMoveInfo(address, null);
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

    public static VmaDefragmentationPassMoveInfo malloc(MemoryStack stack) {
        return new VmaDefragmentationPassMoveInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VmaDefragmentationPassMoveInfo calloc(MemoryStack stack) {
        return new VmaDefragmentationPassMoveInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nmoveCount(long struct) {
        return MemoryUtil.memGetInt(struct + MOVECOUNT);
    }

    public static VmaDefragmentationMove.Buffer npMoves(long struct) {
        return VmaDefragmentationMove.createSafe(MemoryUtil.memGetAddress(struct + PMOVES), nmoveCount(struct));
    }

    public static void nmoveCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MOVECOUNT, value);
    }

    public static void npMoves(long struct, VmaDefragmentationMove.Buffer value) {
        MemoryUtil.memPutAddress(struct + PMOVES, MemoryUtil.memAddressSafe(value));
        nmoveCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        int moveCount = nmoveCount(struct);
        long pMoves = MemoryUtil.memGetAddress(struct + PMOVES);
        if (pMoves != 0) {
            validate(pMoves, moveCount, VmaDefragmentationMove.SIZEOF, VmaDefragmentationMove::validate);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaDefragmentationPassMoveInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaDefragmentationPassMoveInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VmaDefragmentationPassMoveInfo, Buffer> implements NativeResource {
        private static final VmaDefragmentationPassMoveInfo ELEMENT_FACTORY = VmaDefragmentationPassMoveInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VmaDefragmentationPassMoveInfo.SIZEOF);
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
        public VmaDefragmentationPassMoveInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int moveCount() {
            return VmaDefragmentationPassMoveInfo.nmoveCount(address());
        }

        @NativeType("VmaDefragmentationMove *")
        public VmaDefragmentationMove.Buffer pMoves() {
            return VmaDefragmentationPassMoveInfo.npMoves(address());
        }

        public Buffer moveCount(@NativeType("uint32_t") int value) {
            VmaDefragmentationPassMoveInfo.nmoveCount(address(), value);
            return this;
        }

        public Buffer pMoves(@NativeType("VmaDefragmentationMove *") VmaDefragmentationMove.Buffer value) {
            VmaDefragmentationPassMoveInfo.npMoves(address(), value);
            return this;
        }
    }
}
