package org.lwjgl.stb;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.stb.STBRPNode;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBRPContext.class
 */
@NativeType("struct stbrp_context")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBRPContext.class */
public class STBRPContext extends Struct<STBRPContext> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int WIDTH;
    public static final int HEIGHT;
    public static final int ALIGN;
    public static final int INIT_MODE;
    public static final int HEURISTIC;
    public static final int NUM_NODES;
    public static final int ACTIVE_HEAD;
    public static final int FREE_HEAD;
    public static final int EXTRA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __array(STBRPNode.SIZEOF, STBRPNode.ALIGNOF, 2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
        ALIGN = layout.offsetof(2);
        INIT_MODE = layout.offsetof(3);
        HEURISTIC = layout.offsetof(4);
        NUM_NODES = layout.offsetof(5);
        ACTIVE_HEAD = layout.offsetof(6);
        FREE_HEAD = layout.offsetof(7);
        EXTRA = layout.offsetof(8);
    }

    protected STBRPContext(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public STBRPContext create(long address, ByteBuffer container) {
        return new STBRPContext(address, container);
    }

    public STBRPContext(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public int width() {
        return nwidth(address());
    }

    public int height() {
        return nheight(address());
    }

    public int align() {
        return nalign(address());
    }

    public int init_mode() {
        return ninit_mode(address());
    }

    public int heuristic() {
        return nheuristic(address());
    }

    public int num_nodes() {
        return nnum_nodes(address());
    }

    @NativeType("stbrp_node *")
    public STBRPNode active_head() {
        return nactive_head(address());
    }

    @NativeType("stbrp_node *")
    public STBRPNode free_head() {
        return nfree_head(address());
    }

    @NativeType("stbrp_node[2]")
    public STBRPNode.Buffer extra() {
        return nextra(address());
    }

    @NativeType("stbrp_node")
    public STBRPNode extra(int index) {
        return nextra(address(), index);
    }

    public static STBRPContext malloc() {
        return new STBRPContext(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static STBRPContext calloc() {
        return new STBRPContext(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static STBRPContext create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new STBRPContext(MemoryUtil.memAddress(container), container);
    }

    public static STBRPContext create(long address) {
        return new STBRPContext(address, null);
    }

    public static STBRPContext createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new STBRPContext(address, null);
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

    public static STBRPContext malloc(MemoryStack stack) {
        return new STBRPContext(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static STBRPContext calloc(MemoryStack stack) {
        return new STBRPContext(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nwidth(long struct) {
        return MemoryUtil.memGetInt(struct + WIDTH);
    }

    public static int nheight(long struct) {
        return MemoryUtil.memGetInt(struct + HEIGHT);
    }

    public static int nalign(long struct) {
        return MemoryUtil.memGetInt(struct + ALIGN);
    }

    public static int ninit_mode(long struct) {
        return MemoryUtil.memGetInt(struct + INIT_MODE);
    }

    public static int nheuristic(long struct) {
        return MemoryUtil.memGetInt(struct + HEURISTIC);
    }

    public static int nnum_nodes(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_NODES);
    }

    public static STBRPNode nactive_head(long struct) {
        return STBRPNode.createSafe(MemoryUtil.memGetAddress(struct + ACTIVE_HEAD));
    }

    public static STBRPNode nfree_head(long struct) {
        return STBRPNode.createSafe(MemoryUtil.memGetAddress(struct + FREE_HEAD));
    }

    public static STBRPNode.Buffer nextra(long struct) {
        return STBRPNode.create(struct + EXTRA, 2);
    }

    public static STBRPNode nextra(long struct, int index) {
        return STBRPNode.create(struct + EXTRA + (Checks.check(index, 2) * STBRPNode.SIZEOF));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBRPContext$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBRPContext$Buffer.class */
    public static class Buffer extends StructBuffer<STBRPContext, Buffer> implements NativeResource {
        private static final STBRPContext ELEMENT_FACTORY = STBRPContext.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / STBRPContext.SIZEOF);
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
        public STBRPContext getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int width() {
            return STBRPContext.nwidth(address());
        }

        public int height() {
            return STBRPContext.nheight(address());
        }

        public int align() {
            return STBRPContext.nalign(address());
        }

        public int init_mode() {
            return STBRPContext.ninit_mode(address());
        }

        public int heuristic() {
            return STBRPContext.nheuristic(address());
        }

        public int num_nodes() {
            return STBRPContext.nnum_nodes(address());
        }

        @NativeType("stbrp_node *")
        public STBRPNode active_head() {
            return STBRPContext.nactive_head(address());
        }

        @NativeType("stbrp_node *")
        public STBRPNode free_head() {
            return STBRPContext.nfree_head(address());
        }

        @NativeType("stbrp_node[2]")
        public STBRPNode.Buffer extra() {
            return STBRPContext.nextra(address());
        }

        @NativeType("stbrp_node")
        public STBRPNode extra(int index) {
            return STBRPContext.nextra(address(), index);
        }
    }
}
