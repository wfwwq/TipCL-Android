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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBRPRect.class
 */
@NativeType("struct stbrp_rect")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBRPRect.class */
public class STBRPRect extends Struct<STBRPRect> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ID;
    public static final int W;
    public static final int H;
    public static final int X;
    public static final int Y;
    public static final int WAS_PACKED;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ID = layout.offsetof(0);
        W = layout.offsetof(1);
        H = layout.offsetof(2);
        X = layout.offsetof(3);
        Y = layout.offsetof(4);
        WAS_PACKED = layout.offsetof(5);
    }

    protected STBRPRect(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public STBRPRect create(long address, ByteBuffer container) {
        return new STBRPRect(address, container);
    }

    public STBRPRect(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public int id() {
        return nid(address());
    }

    @NativeType("stbrp_coord")
    public int w() {
        return nw(address());
    }

    @NativeType("stbrp_coord")
    public int h() {
        return nh(address());
    }

    @NativeType("stbrp_coord")
    public int x() {
        return nx(address());
    }

    @NativeType("stbrp_coord")
    public int y() {
        return ny(address());
    }

    @NativeType("int")
    public boolean was_packed() {
        return nwas_packed(address()) != 0;
    }

    public STBRPRect id(int value) {
        nid(address(), value);
        return this;
    }

    public STBRPRect w(@NativeType("stbrp_coord") int value) {
        nw(address(), value);
        return this;
    }

    public STBRPRect h(@NativeType("stbrp_coord") int value) {
        nh(address(), value);
        return this;
    }

    public STBRPRect x(@NativeType("stbrp_coord") int value) {
        nx(address(), value);
        return this;
    }

    public STBRPRect y(@NativeType("stbrp_coord") int value) {
        ny(address(), value);
        return this;
    }

    public STBRPRect was_packed(@NativeType("int") boolean value) {
        nwas_packed(address(), value ? 1 : 0);
        return this;
    }

    public STBRPRect set(int id, int w, int h, int x, int y, boolean was_packed) {
        id(id);
        w(w);
        h(h);
        x(x);
        y(y);
        was_packed(was_packed);
        return this;
    }

    public STBRPRect set(STBRPRect src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static STBRPRect malloc() {
        return new STBRPRect(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static STBRPRect calloc() {
        return new STBRPRect(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static STBRPRect create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new STBRPRect(MemoryUtil.memAddress(container), container);
    }

    public static STBRPRect create(long address) {
        return new STBRPRect(address, null);
    }

    public static STBRPRect createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new STBRPRect(address, null);
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

    public static STBRPRect malloc(MemoryStack stack) {
        return new STBRPRect(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static STBRPRect calloc(MemoryStack stack) {
        return new STBRPRect(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nid(long struct) {
        return MemoryUtil.memGetInt(struct + ID);
    }

    public static int nw(long struct) {
        return MemoryUtil.memGetInt(struct + W);
    }

    public static int nh(long struct) {
        return MemoryUtil.memGetInt(struct + H);
    }

    public static int nx(long struct) {
        return MemoryUtil.memGetInt(struct + X);
    }

    public static int ny(long struct) {
        return MemoryUtil.memGetInt(struct + Y);
    }

    public static int nwas_packed(long struct) {
        return MemoryUtil.memGetInt(struct + WAS_PACKED);
    }

    public static void nid(long struct, int value) {
        MemoryUtil.memPutInt(struct + ID, value);
    }

    public static void nw(long struct, int value) {
        MemoryUtil.memPutInt(struct + W, value);
    }

    public static void nh(long struct, int value) {
        MemoryUtil.memPutInt(struct + H, value);
    }

    public static void nx(long struct, int value) {
        MemoryUtil.memPutInt(struct + X, value);
    }

    public static void ny(long struct, int value) {
        MemoryUtil.memPutInt(struct + Y, value);
    }

    public static void nwas_packed(long struct, int value) {
        MemoryUtil.memPutInt(struct + WAS_PACKED, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBRPRect$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBRPRect$Buffer.class */
    public static class Buffer extends StructBuffer<STBRPRect, Buffer> implements NativeResource {
        private static final STBRPRect ELEMENT_FACTORY = STBRPRect.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / STBRPRect.SIZEOF);
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
        public STBRPRect getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int id() {
            return STBRPRect.nid(address());
        }

        @NativeType("stbrp_coord")
        public int w() {
            return STBRPRect.nw(address());
        }

        @NativeType("stbrp_coord")
        public int h() {
            return STBRPRect.nh(address());
        }

        @NativeType("stbrp_coord")
        public int x() {
            return STBRPRect.nx(address());
        }

        @NativeType("stbrp_coord")
        public int y() {
            return STBRPRect.ny(address());
        }

        @NativeType("int")
        public boolean was_packed() {
            return STBRPRect.nwas_packed(address()) != 0;
        }

        public Buffer id(int value) {
            STBRPRect.nid(address(), value);
            return this;
        }

        public Buffer w(@NativeType("stbrp_coord") int value) {
            STBRPRect.nw(address(), value);
            return this;
        }

        public Buffer h(@NativeType("stbrp_coord") int value) {
            STBRPRect.nh(address(), value);
            return this;
        }

        public Buffer x(@NativeType("stbrp_coord") int value) {
            STBRPRect.nx(address(), value);
            return this;
        }

        public Buffer y(@NativeType("stbrp_coord") int value) {
            STBRPRect.ny(address(), value);
            return this;
        }

        public Buffer was_packed(@NativeType("int") boolean value) {
            STBRPRect.nwas_packed(address(), value ? 1 : 0);
            return this;
        }
    }
}
