package org.lwjgl.stb;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.stb.STBRPNode;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBTTPackContext.class
 */
@NativeType("struct stbtt_pack_context")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBTTPackContext.class */
public class STBTTPackContext extends Struct<STBTTPackContext> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int USER_ALLOCATOR_CONTEXT;
    public static final int PACK_INFO;
    public static final int WIDTH;
    public static final int HEIGHT;
    public static final int STRIDE_IN_BYTES;
    public static final int PADDING;
    public static final int SKIP_MISSING;
    public static final int H_OVERSAMPLE;
    public static final int V_OVERSAMPLE;
    public static final int PIXELS;
    public static final int NODES;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        USER_ALLOCATOR_CONTEXT = layout.offsetof(0);
        PACK_INFO = layout.offsetof(1);
        WIDTH = layout.offsetof(2);
        HEIGHT = layout.offsetof(3);
        STRIDE_IN_BYTES = layout.offsetof(4);
        PADDING = layout.offsetof(5);
        SKIP_MISSING = layout.offsetof(6);
        H_OVERSAMPLE = layout.offsetof(7);
        V_OVERSAMPLE = layout.offsetof(8);
        PIXELS = layout.offsetof(9);
        NODES = layout.offsetof(10);
    }

    protected STBTTPackContext(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public STBTTPackContext create(long address, ByteBuffer container) {
        return new STBTTPackContext(address, container);
    }

    public STBTTPackContext(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("void *")
    public long user_allocator_context() {
        return nuser_allocator_context(address());
    }

    @NativeType("stbrp_context *")
    public STBRPContext pack_info() {
        return npack_info(address());
    }

    public int width() {
        return nwidth(address());
    }

    public int height() {
        return nheight(address());
    }

    public int stride_in_bytes() {
        return nstride_in_bytes(address());
    }

    public int padding() {
        return npadding(address());
    }

    @NativeType("int")
    public boolean skip_missing() {
        return nskip_missing(address()) != 0;
    }

    @NativeType("unsigned int")
    public int h_oversample() {
        return nh_oversample(address());
    }

    @NativeType("unsigned int")
    public int v_oversample() {
        return nv_oversample(address());
    }

    @NativeType("unsigned char *")
    public ByteBuffer pixels(int capacity) {
        return npixels(address(), capacity);
    }

    @NativeType("stbrp_node *")
    public STBRPNode.Buffer nodes(int capacity) {
        return nnodes(address(), capacity);
    }

    public static STBTTPackContext malloc() {
        return new STBTTPackContext(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static STBTTPackContext calloc() {
        return new STBTTPackContext(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static STBTTPackContext create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new STBTTPackContext(MemoryUtil.memAddress(container), container);
    }

    public static STBTTPackContext create(long address) {
        return new STBTTPackContext(address, null);
    }

    public static STBTTPackContext createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new STBTTPackContext(address, null);
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

    public static STBTTPackContext malloc(MemoryStack stack) {
        return new STBTTPackContext(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static STBTTPackContext calloc(MemoryStack stack) {
        return new STBTTPackContext(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nuser_allocator_context(long struct) {
        return MemoryUtil.memGetAddress(struct + USER_ALLOCATOR_CONTEXT);
    }

    public static STBRPContext npack_info(long struct) {
        return STBRPContext.create(MemoryUtil.memGetAddress(struct + PACK_INFO));
    }

    public static int nwidth(long struct) {
        return MemoryUtil.memGetInt(struct + WIDTH);
    }

    public static int nheight(long struct) {
        return MemoryUtil.memGetInt(struct + HEIGHT);
    }

    public static int nstride_in_bytes(long struct) {
        return MemoryUtil.memGetInt(struct + STRIDE_IN_BYTES);
    }

    public static int npadding(long struct) {
        return MemoryUtil.memGetInt(struct + PADDING);
    }

    public static int nskip_missing(long struct) {
        return MemoryUtil.memGetInt(struct + SKIP_MISSING);
    }

    public static int nh_oversample(long struct) {
        return MemoryUtil.memGetInt(struct + H_OVERSAMPLE);
    }

    public static int nv_oversample(long struct) {
        return MemoryUtil.memGetInt(struct + V_OVERSAMPLE);
    }

    public static ByteBuffer npixels(long struct, int capacity) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + PIXELS), capacity);
    }

    public static STBRPNode.Buffer nnodes(long struct, int capacity) {
        return STBRPNode.create(MemoryUtil.memGetAddress(struct + NODES), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBTTPackContext$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBTTPackContext$Buffer.class */
    public static class Buffer extends StructBuffer<STBTTPackContext, Buffer> implements NativeResource {
        private static final STBTTPackContext ELEMENT_FACTORY = STBTTPackContext.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / STBTTPackContext.SIZEOF);
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
        public STBTTPackContext getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("void *")
        public long user_allocator_context() {
            return STBTTPackContext.nuser_allocator_context(address());
        }

        @NativeType("stbrp_context *")
        public STBRPContext pack_info() {
            return STBTTPackContext.npack_info(address());
        }

        public int width() {
            return STBTTPackContext.nwidth(address());
        }

        public int height() {
            return STBTTPackContext.nheight(address());
        }

        public int stride_in_bytes() {
            return STBTTPackContext.nstride_in_bytes(address());
        }

        public int padding() {
            return STBTTPackContext.npadding(address());
        }

        @NativeType("int")
        public boolean skip_missing() {
            return STBTTPackContext.nskip_missing(address()) != 0;
        }

        @NativeType("unsigned int")
        public int h_oversample() {
            return STBTTPackContext.nh_oversample(address());
        }

        @NativeType("unsigned int")
        public int v_oversample() {
            return STBTTPackContext.nv_oversample(address());
        }

        @NativeType("unsigned char *")
        public ByteBuffer pixels(int capacity) {
            return STBTTPackContext.npixels(address(), capacity);
        }

        @NativeType("stbrp_node *")
        public STBRPNode.Buffer nodes(int capacity) {
            return STBTTPackContext.nnodes(address(), capacity);
        }
    }
}
