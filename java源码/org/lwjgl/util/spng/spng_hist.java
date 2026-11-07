package org.lwjgl.util.spng;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spng_hist")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_hist.class */
public class spng_hist extends Struct<spng_hist> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FREQUENCY;

    static {
        Struct.Layout layout = __struct(__array(2, 256));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FREQUENCY = layout.offsetof(0);
    }

    protected spng_hist(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public spng_hist create(long address, ByteBuffer container) {
        return new spng_hist(address, container);
    }

    public spng_hist(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint16_t[256]")
    public ShortBuffer frequency() {
        return nfrequency(address());
    }

    @NativeType("uint16_t")
    public short frequency(int index) {
        return nfrequency(address(), index);
    }

    public spng_hist frequency(@NativeType("uint16_t[256]") ShortBuffer value) {
        nfrequency(address(), value);
        return this;
    }

    public spng_hist frequency(int index, @NativeType("uint16_t") short value) {
        nfrequency(address(), index, value);
        return this;
    }

    public spng_hist set(spng_hist src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static spng_hist malloc() {
        return new spng_hist(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static spng_hist calloc() {
        return new spng_hist(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static spng_hist create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_hist(MemoryUtil.memAddress(container), container);
    }

    public static spng_hist create(long address) {
        return new spng_hist(address, null);
    }

    public static spng_hist createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new spng_hist(address, null);
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

    public static spng_hist malloc(MemoryStack stack) {
        return new spng_hist(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static spng_hist calloc(MemoryStack stack) {
        return new spng_hist(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ShortBuffer nfrequency(long struct) {
        return MemoryUtil.memShortBuffer(struct + FREQUENCY, 256);
    }

    public static short nfrequency(long struct, int index) {
        return MemoryUtil.memGetShort(struct + FREQUENCY + (Checks.check(index, 256) * 2));
    }

    public static void nfrequency(long struct, ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 256);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + FREQUENCY, value.remaining() * 2);
    }

    public static void nfrequency(long struct, int index, short value) {
        MemoryUtil.memPutShort(struct + FREQUENCY + (Checks.check(index, 256) * 2), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_hist$Buffer.class */
    public static class Buffer extends StructBuffer<spng_hist, Buffer> implements NativeResource {
        private static final spng_hist ELEMENT_FACTORY = spng_hist.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / spng_hist.SIZEOF);
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
        public spng_hist getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint16_t[256]")
        public ShortBuffer frequency() {
            return spng_hist.nfrequency(address());
        }

        @NativeType("uint16_t")
        public short frequency(int index) {
            return spng_hist.nfrequency(address(), index);
        }

        public Buffer frequency(@NativeType("uint16_t[256]") ShortBuffer value) {
            spng_hist.nfrequency(address(), value);
            return this;
        }

        public Buffer frequency(int index, @NativeType("uint16_t") short value) {
            spng_hist.nfrequency(address(), index, value);
            return this;
        }
    }
}
