package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_ListNode.class
 */
@NativeType("struct FT_ListNodeRec")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_ListNode.class */
public class FT_ListNode extends Struct<FT_ListNode> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PREV;
    public static final int NEXT;
    public static final int DATA;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PREV = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        DATA = layout.offsetof(2);
    }

    protected FT_ListNode(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_ListNode create(long address, ByteBuffer container) {
        return new FT_ListNode(address, container);
    }

    public FT_ListNode(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public FT_ListNode prev() {
        return nprev(address());
    }

    public FT_ListNode next() {
        return nnext(address());
    }

    @NativeType("void *")
    public ByteBuffer data(int capacity) {
        return ndata(address(), capacity);
    }

    public static FT_ListNode create(long address) {
        return new FT_ListNode(address, null);
    }

    public static FT_ListNode createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_ListNode(address, null);
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

    public static FT_ListNode nprev(long struct) {
        return createSafe(MemoryUtil.memGetAddress(struct + PREV));
    }

    public static FT_ListNode nnext(long struct) {
        return createSafe(MemoryUtil.memGetAddress(struct + NEXT));
    }

    public static ByteBuffer ndata(long struct, int capacity) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + DATA), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_ListNode$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_ListNode$Buffer.class */
    public static class Buffer extends StructBuffer<FT_ListNode, Buffer> {
        private static final FT_ListNode ELEMENT_FACTORY = FT_ListNode.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_ListNode.SIZEOF);
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
        public FT_ListNode getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public FT_ListNode prev() {
            return FT_ListNode.nprev(address());
        }

        public FT_ListNode next() {
            return FT_ListNode.nnext(address());
        }

        @NativeType("void *")
        public ByteBuffer data(int capacity) {
            return FT_ListNode.ndata(address(), capacity);
        }
    }
}
