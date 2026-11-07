package org.lwjgl.util.spng;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spng_splt_entry")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_splt_entry.class */
public class spng_splt_entry extends Struct<spng_splt_entry> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int RED;
    public static final int GREEN;
    public static final int BLUE;
    public static final int ALPHA;
    public static final int FREQUENCY;

    static {
        Struct.Layout layout = __struct(__member(2), __member(2), __member(2), __member(2), __member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        RED = layout.offsetof(0);
        GREEN = layout.offsetof(1);
        BLUE = layout.offsetof(2);
        ALPHA = layout.offsetof(3);
        FREQUENCY = layout.offsetof(4);
    }

    protected spng_splt_entry(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public spng_splt_entry create(long address, ByteBuffer container) {
        return new spng_splt_entry(address, container);
    }

    public spng_splt_entry(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint16_t")
    public short red() {
        return nred(address());
    }

    @NativeType("uint16_t")
    public short green() {
        return ngreen(address());
    }

    @NativeType("uint16_t")
    public short blue() {
        return nblue(address());
    }

    @NativeType("uint16_t")
    public short alpha() {
        return nalpha(address());
    }

    @NativeType("uint16_t")
    public short frequency() {
        return nfrequency(address());
    }

    public spng_splt_entry red(@NativeType("uint16_t") short value) {
        nred(address(), value);
        return this;
    }

    public spng_splt_entry green(@NativeType("uint16_t") short value) {
        ngreen(address(), value);
        return this;
    }

    public spng_splt_entry blue(@NativeType("uint16_t") short value) {
        nblue(address(), value);
        return this;
    }

    public spng_splt_entry alpha(@NativeType("uint16_t") short value) {
        nalpha(address(), value);
        return this;
    }

    public spng_splt_entry frequency(@NativeType("uint16_t") short value) {
        nfrequency(address(), value);
        return this;
    }

    public spng_splt_entry set(short red, short green, short blue, short alpha, short frequency) {
        red(red);
        green(green);
        blue(blue);
        alpha(alpha);
        frequency(frequency);
        return this;
    }

    public spng_splt_entry set(spng_splt_entry src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static spng_splt_entry malloc() {
        return new spng_splt_entry(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static spng_splt_entry calloc() {
        return new spng_splt_entry(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static spng_splt_entry create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_splt_entry(MemoryUtil.memAddress(container), container);
    }

    public static spng_splt_entry create(long address) {
        return new spng_splt_entry(address, null);
    }

    public static spng_splt_entry createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new spng_splt_entry(address, null);
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

    public static spng_splt_entry malloc(MemoryStack stack) {
        return new spng_splt_entry(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static spng_splt_entry calloc(MemoryStack stack) {
        return new spng_splt_entry(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static short nred(long struct) {
        return MemoryUtil.memGetShort(struct + RED);
    }

    public static short ngreen(long struct) {
        return MemoryUtil.memGetShort(struct + GREEN);
    }

    public static short nblue(long struct) {
        return MemoryUtil.memGetShort(struct + BLUE);
    }

    public static short nalpha(long struct) {
        return MemoryUtil.memGetShort(struct + ALPHA);
    }

    public static short nfrequency(long struct) {
        return MemoryUtil.memGetShort(struct + FREQUENCY);
    }

    public static void nred(long struct, short value) {
        MemoryUtil.memPutShort(struct + RED, value);
    }

    public static void ngreen(long struct, short value) {
        MemoryUtil.memPutShort(struct + GREEN, value);
    }

    public static void nblue(long struct, short value) {
        MemoryUtil.memPutShort(struct + BLUE, value);
    }

    public static void nalpha(long struct, short value) {
        MemoryUtil.memPutShort(struct + ALPHA, value);
    }

    public static void nfrequency(long struct, short value) {
        MemoryUtil.memPutShort(struct + FREQUENCY, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_splt_entry$Buffer.class */
    public static class Buffer extends StructBuffer<spng_splt_entry, Buffer> implements NativeResource {
        private static final spng_splt_entry ELEMENT_FACTORY = spng_splt_entry.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / spng_splt_entry.SIZEOF);
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
        public spng_splt_entry getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint16_t")
        public short red() {
            return spng_splt_entry.nred(address());
        }

        @NativeType("uint16_t")
        public short green() {
            return spng_splt_entry.ngreen(address());
        }

        @NativeType("uint16_t")
        public short blue() {
            return spng_splt_entry.nblue(address());
        }

        @NativeType("uint16_t")
        public short alpha() {
            return spng_splt_entry.nalpha(address());
        }

        @NativeType("uint16_t")
        public short frequency() {
            return spng_splt_entry.nfrequency(address());
        }

        public Buffer red(@NativeType("uint16_t") short value) {
            spng_splt_entry.nred(address(), value);
            return this;
        }

        public Buffer green(@NativeType("uint16_t") short value) {
            spng_splt_entry.ngreen(address(), value);
            return this;
        }

        public Buffer blue(@NativeType("uint16_t") short value) {
            spng_splt_entry.nblue(address(), value);
            return this;
        }

        public Buffer alpha(@NativeType("uint16_t") short value) {
            spng_splt_entry.nalpha(address(), value);
            return this;
        }

        public Buffer frequency(@NativeType("uint16_t") short value) {
            spng_splt_entry.nfrequency(address(), value);
            return this;
        }
    }
}
