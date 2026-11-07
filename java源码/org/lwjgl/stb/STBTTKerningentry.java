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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBTTKerningentry.class
 */
@NativeType("struct stbtt_kerningentry")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBTTKerningentry.class */
public class STBTTKerningentry extends Struct<STBTTKerningentry> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int GLYPH1;
    public static final int GLYPH2;
    public static final int ADVANCE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        GLYPH1 = layout.offsetof(0);
        GLYPH2 = layout.offsetof(1);
        ADVANCE = layout.offsetof(2);
    }

    protected STBTTKerningentry(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public STBTTKerningentry create(long address, ByteBuffer container) {
        return new STBTTKerningentry(address, container);
    }

    public STBTTKerningentry(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public int glyph1() {
        return nglyph1(address());
    }

    public int glyph2() {
        return nglyph2(address());
    }

    public int advance() {
        return nadvance(address());
    }

    public static STBTTKerningentry malloc() {
        return new STBTTKerningentry(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static STBTTKerningentry calloc() {
        return new STBTTKerningentry(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static STBTTKerningentry create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new STBTTKerningentry(MemoryUtil.memAddress(container), container);
    }

    public static STBTTKerningentry create(long address) {
        return new STBTTKerningentry(address, null);
    }

    public static STBTTKerningentry createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new STBTTKerningentry(address, null);
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

    public static STBTTKerningentry malloc(MemoryStack stack) {
        return new STBTTKerningentry(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static STBTTKerningentry calloc(MemoryStack stack) {
        return new STBTTKerningentry(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nglyph1(long struct) {
        return MemoryUtil.memGetInt(struct + GLYPH1);
    }

    public static int nglyph2(long struct) {
        return MemoryUtil.memGetInt(struct + GLYPH2);
    }

    public static int nadvance(long struct) {
        return MemoryUtil.memGetInt(struct + ADVANCE);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBTTKerningentry$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBTTKerningentry$Buffer.class */
    public static class Buffer extends StructBuffer<STBTTKerningentry, Buffer> implements NativeResource {
        private static final STBTTKerningentry ELEMENT_FACTORY = STBTTKerningentry.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / STBTTKerningentry.SIZEOF);
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
        public STBTTKerningentry getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int glyph1() {
            return STBTTKerningentry.nglyph1(address());
        }

        public int glyph2() {
            return STBTTKerningentry.nglyph2(address());
        }

        public int advance() {
            return STBTTKerningentry.nadvance(address());
        }
    }
}
