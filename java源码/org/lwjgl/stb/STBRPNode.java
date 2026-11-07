package org.lwjgl.stb;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBRPNode.class
 */
@NativeType("struct stbrp_node")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBRPNode.class */
public class STBRPNode extends Struct<STBRPNode> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int X;
    public static final int Y;
    public static final int NEXT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        NEXT = layout.offsetof(2);
    }

    protected STBRPNode(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public STBRPNode create(long address, ByteBuffer container) {
        return new STBRPNode(address, container);
    }

    public STBRPNode(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("stbrp_coord")
    public int x() {
        return nx(address());
    }

    @NativeType("stbrp_coord")
    public int y() {
        return ny(address());
    }

    @NativeType("stbrp_node *")
    public STBRPNode next() {
        return nnext(address());
    }

    public static STBRPNode malloc() {
        return new STBRPNode(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static STBRPNode calloc() {
        return new STBRPNode(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static STBRPNode create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new STBRPNode(MemoryUtil.memAddress(container), container);
    }

    public static STBRPNode create(long address) {
        return new STBRPNode(address, null);
    }

    public static STBRPNode createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new STBRPNode(address, null);
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

    public static STBRPNode malloc(MemoryStack stack) {
        return new STBRPNode(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static STBRPNode calloc(MemoryStack stack) {
        return new STBRPNode(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nx(long struct) {
        return MemoryUtil.memGetInt(struct + X);
    }

    public static int ny(long struct) {
        return MemoryUtil.memGetInt(struct + Y);
    }

    public static STBRPNode nnext(long struct) {
        return createSafe(MemoryUtil.memGetAddress(struct + NEXT));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBRPNode$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBRPNode$Buffer.class */
    public static class Buffer extends StructBuffer<STBRPNode, Buffer> implements NativeResource {
        private static final STBRPNode ELEMENT_FACTORY = STBRPNode.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / STBRPNode.SIZEOF);
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
        public STBRPNode getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("stbrp_coord")
        public int x() {
            return STBRPNode.nx(address());
        }

        @NativeType("stbrp_coord")
        public int y() {
            return STBRPNode.ny(address());
        }

        @NativeType("stbrp_node *")
        public STBRPNode next() {
            return STBRPNode.nnext(address());
        }
    }
}
