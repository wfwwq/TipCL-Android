package org.lwjgl.util.spng;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spng_time")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_time.class */
public class spng_time extends Struct<spng_time> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int YEAR;
    public static final int MONTH;
    public static final int DAY;
    public static final int HOUR;
    public static final int MINUTE;
    public static final int SECOND;

    static {
        Struct.Layout layout = __struct(__member(2), __member(1), __member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        YEAR = layout.offsetof(0);
        MONTH = layout.offsetof(1);
        DAY = layout.offsetof(2);
        HOUR = layout.offsetof(3);
        MINUTE = layout.offsetof(4);
        SECOND = layout.offsetof(5);
    }

    protected spng_time(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public spng_time create(long address, ByteBuffer container) {
        return new spng_time(address, container);
    }

    public spng_time(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint16_t")
    public short year() {
        return nyear(address());
    }

    @NativeType("uint8_t")
    public byte month() {
        return nmonth(address());
    }

    @NativeType("uint8_t")
    public byte day() {
        return nday(address());
    }

    @NativeType("uint8_t")
    public byte hour() {
        return nhour(address());
    }

    @NativeType("uint8_t")
    public byte minute() {
        return nminute(address());
    }

    @NativeType("uint8_t")
    public byte second() {
        return nsecond(address());
    }

    public spng_time year(@NativeType("uint16_t") short value) {
        nyear(address(), value);
        return this;
    }

    public spng_time month(@NativeType("uint8_t") byte value) {
        nmonth(address(), value);
        return this;
    }

    public spng_time day(@NativeType("uint8_t") byte value) {
        nday(address(), value);
        return this;
    }

    public spng_time hour(@NativeType("uint8_t") byte value) {
        nhour(address(), value);
        return this;
    }

    public spng_time minute(@NativeType("uint8_t") byte value) {
        nminute(address(), value);
        return this;
    }

    public spng_time second(@NativeType("uint8_t") byte value) {
        nsecond(address(), value);
        return this;
    }

    public spng_time set(short year, byte month, byte day, byte hour, byte minute, byte second) {
        year(year);
        month(month);
        day(day);
        hour(hour);
        minute(minute);
        second(second);
        return this;
    }

    public spng_time set(spng_time src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static spng_time malloc() {
        return new spng_time(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static spng_time calloc() {
        return new spng_time(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static spng_time create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_time(MemoryUtil.memAddress(container), container);
    }

    public static spng_time create(long address) {
        return new spng_time(address, null);
    }

    public static spng_time createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new spng_time(address, null);
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

    public static spng_time malloc(MemoryStack stack) {
        return new spng_time(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static spng_time calloc(MemoryStack stack) {
        return new spng_time(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static short nyear(long struct) {
        return MemoryUtil.memGetShort(struct + YEAR);
    }

    public static byte nmonth(long struct) {
        return MemoryUtil.memGetByte(struct + MONTH);
    }

    public static byte nday(long struct) {
        return MemoryUtil.memGetByte(struct + DAY);
    }

    public static byte nhour(long struct) {
        return MemoryUtil.memGetByte(struct + HOUR);
    }

    public static byte nminute(long struct) {
        return MemoryUtil.memGetByte(struct + MINUTE);
    }

    public static byte nsecond(long struct) {
        return MemoryUtil.memGetByte(struct + SECOND);
    }

    public static void nyear(long struct, short value) {
        MemoryUtil.memPutShort(struct + YEAR, value);
    }

    public static void nmonth(long struct, byte value) {
        MemoryUtil.memPutByte(struct + MONTH, value);
    }

    public static void nday(long struct, byte value) {
        MemoryUtil.memPutByte(struct + DAY, value);
    }

    public static void nhour(long struct, byte value) {
        MemoryUtil.memPutByte(struct + HOUR, value);
    }

    public static void nminute(long struct, byte value) {
        MemoryUtil.memPutByte(struct + MINUTE, value);
    }

    public static void nsecond(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SECOND, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_time$Buffer.class */
    public static class Buffer extends StructBuffer<spng_time, Buffer> implements NativeResource {
        private static final spng_time ELEMENT_FACTORY = spng_time.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / spng_time.SIZEOF);
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
        public spng_time getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint16_t")
        public short year() {
            return spng_time.nyear(address());
        }

        @NativeType("uint8_t")
        public byte month() {
            return spng_time.nmonth(address());
        }

        @NativeType("uint8_t")
        public byte day() {
            return spng_time.nday(address());
        }

        @NativeType("uint8_t")
        public byte hour() {
            return spng_time.nhour(address());
        }

        @NativeType("uint8_t")
        public byte minute() {
            return spng_time.nminute(address());
        }

        @NativeType("uint8_t")
        public byte second() {
            return spng_time.nsecond(address());
        }

        public Buffer year(@NativeType("uint16_t") short value) {
            spng_time.nyear(address(), value);
            return this;
        }

        public Buffer month(@NativeType("uint8_t") byte value) {
            spng_time.nmonth(address(), value);
            return this;
        }

        public Buffer day(@NativeType("uint8_t") byte value) {
            spng_time.nday(address(), value);
            return this;
        }

        public Buffer hour(@NativeType("uint8_t") byte value) {
            spng_time.nhour(address(), value);
            return this;
        }

        public Buffer minute(@NativeType("uint8_t") byte value) {
            spng_time.nminute(address(), value);
            return this;
        }

        public Buffer second(@NativeType("uint8_t") byte value) {
            spng_time.nsecond(address(), value);
            return this;
        }
    }
}
