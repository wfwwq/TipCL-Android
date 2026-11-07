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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBTTAlignedQuad.class
 */
@NativeType("struct stbtt_aligned_quad")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBTTAlignedQuad.class */
public class STBTTAlignedQuad extends Struct<STBTTAlignedQuad> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int X0;
    public static final int Y0;
    public static final int S0;
    public static final int T0;
    public static final int X1;
    public static final int Y1;
    public static final int S1;
    public static final int T1;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        X0 = layout.offsetof(0);
        Y0 = layout.offsetof(1);
        S0 = layout.offsetof(2);
        T0 = layout.offsetof(3);
        X1 = layout.offsetof(4);
        Y1 = layout.offsetof(5);
        S1 = layout.offsetof(6);
        T1 = layout.offsetof(7);
    }

    protected STBTTAlignedQuad(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public STBTTAlignedQuad create(long address, ByteBuffer container) {
        return new STBTTAlignedQuad(address, container);
    }

    public STBTTAlignedQuad(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public float x0() {
        return nx0(address());
    }

    public float y0() {
        return ny0(address());
    }

    public float s0() {
        return ns0(address());
    }

    public float t0() {
        return nt0(address());
    }

    public float x1() {
        return nx1(address());
    }

    public float y1() {
        return ny1(address());
    }

    public float s1() {
        return ns1(address());
    }

    public float t1() {
        return nt1(address());
    }

    public static STBTTAlignedQuad malloc() {
        return new STBTTAlignedQuad(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static STBTTAlignedQuad calloc() {
        return new STBTTAlignedQuad(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static STBTTAlignedQuad create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new STBTTAlignedQuad(MemoryUtil.memAddress(container), container);
    }

    public static STBTTAlignedQuad create(long address) {
        return new STBTTAlignedQuad(address, null);
    }

    public static STBTTAlignedQuad createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new STBTTAlignedQuad(address, null);
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

    public static STBTTAlignedQuad malloc(MemoryStack stack) {
        return new STBTTAlignedQuad(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static STBTTAlignedQuad calloc(MemoryStack stack) {
        return new STBTTAlignedQuad(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static float nx0(long struct) {
        return MemoryUtil.memGetFloat(struct + X0);
    }

    public static float ny0(long struct) {
        return MemoryUtil.memGetFloat(struct + Y0);
    }

    public static float ns0(long struct) {
        return MemoryUtil.memGetFloat(struct + S0);
    }

    public static float nt0(long struct) {
        return MemoryUtil.memGetFloat(struct + T0);
    }

    public static float nx1(long struct) {
        return MemoryUtil.memGetFloat(struct + X1);
    }

    public static float ny1(long struct) {
        return MemoryUtil.memGetFloat(struct + Y1);
    }

    public static float ns1(long struct) {
        return MemoryUtil.memGetFloat(struct + S1);
    }

    public static float nt1(long struct) {
        return MemoryUtil.memGetFloat(struct + T1);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBTTAlignedQuad$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBTTAlignedQuad$Buffer.class */
    public static class Buffer extends StructBuffer<STBTTAlignedQuad, Buffer> implements NativeResource {
        private static final STBTTAlignedQuad ELEMENT_FACTORY = STBTTAlignedQuad.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / STBTTAlignedQuad.SIZEOF);
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
        public STBTTAlignedQuad getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public float x0() {
            return STBTTAlignedQuad.nx0(address());
        }

        public float y0() {
            return STBTTAlignedQuad.ny0(address());
        }

        public float s0() {
            return STBTTAlignedQuad.ns0(address());
        }

        public float t0() {
            return STBTTAlignedQuad.nt0(address());
        }

        public float x1() {
            return STBTTAlignedQuad.nx1(address());
        }

        public float y1() {
            return STBTTAlignedQuad.ny1(address());
        }

        public float s1() {
            return STBTTAlignedQuad.ns1(address());
        }

        public float t1() {
            return STBTTAlignedQuad.nt1(address());
        }
    }
}
