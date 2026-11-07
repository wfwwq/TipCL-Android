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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBTTVertex.class
 */
@NativeType("struct stbtt_vertex")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBTTVertex.class */
public class STBTTVertex extends Struct<STBTTVertex> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int X;
    public static final int Y;
    public static final int CX;
    public static final int CY;
    public static final int CX1;
    public static final int CY1;
    public static final int TYPE;

    static {
        Struct.Layout layout = __struct(__member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        CX = layout.offsetof(2);
        CY = layout.offsetof(3);
        CX1 = layout.offsetof(4);
        CY1 = layout.offsetof(5);
        TYPE = layout.offsetof(6);
    }

    protected STBTTVertex(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public STBTTVertex create(long address, ByteBuffer container) {
        return new STBTTVertex(address, container);
    }

    public STBTTVertex(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("stbtt_vertex_type")
    public short x() {
        return nx(address());
    }

    @NativeType("stbtt_vertex_type")
    public short y() {
        return ny(address());
    }

    @NativeType("stbtt_vertex_type")
    public short cx() {
        return ncx(address());
    }

    @NativeType("stbtt_vertex_type")
    public short cy() {
        return ncy(address());
    }

    @NativeType("stbtt_vertex_type")
    public short cx1() {
        return ncx1(address());
    }

    @NativeType("stbtt_vertex_type")
    public short cy1() {
        return ncy1(address());
    }

    @NativeType("unsigned char")
    public byte type() {
        return ntype(address());
    }

    public static STBTTVertex malloc() {
        return new STBTTVertex(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static STBTTVertex calloc() {
        return new STBTTVertex(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static STBTTVertex create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new STBTTVertex(MemoryUtil.memAddress(container), container);
    }

    public static STBTTVertex create(long address) {
        return new STBTTVertex(address, null);
    }

    public static STBTTVertex createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new STBTTVertex(address, null);
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

    public static STBTTVertex malloc(MemoryStack stack) {
        return new STBTTVertex(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static STBTTVertex calloc(MemoryStack stack) {
        return new STBTTVertex(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static short nx(long struct) {
        return MemoryUtil.memGetShort(struct + X);
    }

    public static short ny(long struct) {
        return MemoryUtil.memGetShort(struct + Y);
    }

    public static short ncx(long struct) {
        return MemoryUtil.memGetShort(struct + CX);
    }

    public static short ncy(long struct) {
        return MemoryUtil.memGetShort(struct + CY);
    }

    public static short ncx1(long struct) {
        return MemoryUtil.memGetShort(struct + CX1);
    }

    public static short ncy1(long struct) {
        return MemoryUtil.memGetShort(struct + CY1);
    }

    public static byte ntype(long struct) {
        return MemoryUtil.memGetByte(struct + TYPE);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBTTVertex$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBTTVertex$Buffer.class */
    public static class Buffer extends StructBuffer<STBTTVertex, Buffer> implements NativeResource {
        private static final STBTTVertex ELEMENT_FACTORY = STBTTVertex.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / STBTTVertex.SIZEOF);
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
        public STBTTVertex getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("stbtt_vertex_type")
        public short x() {
            return STBTTVertex.nx(address());
        }

        @NativeType("stbtt_vertex_type")
        public short y() {
            return STBTTVertex.ny(address());
        }

        @NativeType("stbtt_vertex_type")
        public short cx() {
            return STBTTVertex.ncx(address());
        }

        @NativeType("stbtt_vertex_type")
        public short cy() {
            return STBTTVertex.ncy(address());
        }

        @NativeType("stbtt_vertex_type")
        public short cx1() {
            return STBTTVertex.ncx1(address());
        }

        @NativeType("stbtt_vertex_type")
        public short cy1() {
            return STBTTVertex.ncy1(address());
        }

        @NativeType("unsigned char")
        public byte type() {
            return STBTTVertex.ntype(address());
        }
    }
}
