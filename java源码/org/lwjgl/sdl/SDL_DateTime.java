package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_DateTime.class */
public class SDL_DateTime extends Struct<SDL_DateTime> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int YEAR;
    public static final int MONTH;
    public static final int DAY;
    public static final int HOUR;
    public static final int MINUTE;
    public static final int SECOND;
    public static final int NANOSECOND;
    public static final int DAY_OF_WEEK;
    public static final int UTC_OFFSET;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        YEAR = layout.offsetof(0);
        MONTH = layout.offsetof(1);
        DAY = layout.offsetof(2);
        HOUR = layout.offsetof(3);
        MINUTE = layout.offsetof(4);
        SECOND = layout.offsetof(5);
        NANOSECOND = layout.offsetof(6);
        DAY_OF_WEEK = layout.offsetof(7);
        UTC_OFFSET = layout.offsetof(8);
    }

    protected SDL_DateTime(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_DateTime create(long address, ByteBuffer container) {
        return new SDL_DateTime(address, container);
    }

    public SDL_DateTime(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public int year() {
        return nyear(address());
    }

    public int month() {
        return nmonth(address());
    }

    public int day() {
        return nday(address());
    }

    public int hour() {
        return nhour(address());
    }

    public int minute() {
        return nminute(address());
    }

    public int second() {
        return nsecond(address());
    }

    public int nanosecond() {
        return nnanosecond(address());
    }

    public int day_of_week() {
        return nday_of_week(address());
    }

    public int utc_offset() {
        return nutc_offset(address());
    }

    public SDL_DateTime year(int value) {
        nyear(address(), value);
        return this;
    }

    public SDL_DateTime month(int value) {
        nmonth(address(), value);
        return this;
    }

    public SDL_DateTime day(int value) {
        nday(address(), value);
        return this;
    }

    public SDL_DateTime hour(int value) {
        nhour(address(), value);
        return this;
    }

    public SDL_DateTime minute(int value) {
        nminute(address(), value);
        return this;
    }

    public SDL_DateTime second(int value) {
        nsecond(address(), value);
        return this;
    }

    public SDL_DateTime nanosecond(int value) {
        nnanosecond(address(), value);
        return this;
    }

    public SDL_DateTime day_of_week(int value) {
        nday_of_week(address(), value);
        return this;
    }

    public SDL_DateTime utc_offset(int value) {
        nutc_offset(address(), value);
        return this;
    }

    public SDL_DateTime set(int year, int month, int day, int hour, int minute, int second, int nanosecond, int day_of_week, int utc_offset) {
        year(year);
        month(month);
        day(day);
        hour(hour);
        minute(minute);
        second(second);
        nanosecond(nanosecond);
        day_of_week(day_of_week);
        utc_offset(utc_offset);
        return this;
    }

    public SDL_DateTime set(SDL_DateTime src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_DateTime malloc() {
        return new SDL_DateTime(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_DateTime calloc() {
        return new SDL_DateTime(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_DateTime create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_DateTime(MemoryUtil.memAddress(container), container);
    }

    public static SDL_DateTime create(long address) {
        return new SDL_DateTime(address, null);
    }

    public static SDL_DateTime createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_DateTime(address, null);
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

    public static SDL_DateTime malloc(MemoryStack stack) {
        return new SDL_DateTime(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_DateTime calloc(MemoryStack stack) {
        return new SDL_DateTime(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nyear(long struct) {
        return MemoryUtil.memGetInt(struct + YEAR);
    }

    public static int nmonth(long struct) {
        return MemoryUtil.memGetInt(struct + MONTH);
    }

    public static int nday(long struct) {
        return MemoryUtil.memGetInt(struct + DAY);
    }

    public static int nhour(long struct) {
        return MemoryUtil.memGetInt(struct + HOUR);
    }

    public static int nminute(long struct) {
        return MemoryUtil.memGetInt(struct + MINUTE);
    }

    public static int nsecond(long struct) {
        return MemoryUtil.memGetInt(struct + SECOND);
    }

    public static int nnanosecond(long struct) {
        return MemoryUtil.memGetInt(struct + NANOSECOND);
    }

    public static int nday_of_week(long struct) {
        return MemoryUtil.memGetInt(struct + DAY_OF_WEEK);
    }

    public static int nutc_offset(long struct) {
        return MemoryUtil.memGetInt(struct + UTC_OFFSET);
    }

    public static void nyear(long struct, int value) {
        MemoryUtil.memPutInt(struct + YEAR, value);
    }

    public static void nmonth(long struct, int value) {
        MemoryUtil.memPutInt(struct + MONTH, value);
    }

    public static void nday(long struct, int value) {
        MemoryUtil.memPutInt(struct + DAY, value);
    }

    public static void nhour(long struct, int value) {
        MemoryUtil.memPutInt(struct + HOUR, value);
    }

    public static void nminute(long struct, int value) {
        MemoryUtil.memPutInt(struct + MINUTE, value);
    }

    public static void nsecond(long struct, int value) {
        MemoryUtil.memPutInt(struct + SECOND, value);
    }

    public static void nnanosecond(long struct, int value) {
        MemoryUtil.memPutInt(struct + NANOSECOND, value);
    }

    public static void nday_of_week(long struct, int value) {
        MemoryUtil.memPutInt(struct + DAY_OF_WEEK, value);
    }

    public static void nutc_offset(long struct, int value) {
        MemoryUtil.memPutInt(struct + UTC_OFFSET, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_DateTime$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_DateTime, Buffer> implements NativeResource {
        private static final SDL_DateTime ELEMENT_FACTORY = SDL_DateTime.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_DateTime.SIZEOF);
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
        public SDL_DateTime getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int year() {
            return SDL_DateTime.nyear(address());
        }

        public int month() {
            return SDL_DateTime.nmonth(address());
        }

        public int day() {
            return SDL_DateTime.nday(address());
        }

        public int hour() {
            return SDL_DateTime.nhour(address());
        }

        public int minute() {
            return SDL_DateTime.nminute(address());
        }

        public int second() {
            return SDL_DateTime.nsecond(address());
        }

        public int nanosecond() {
            return SDL_DateTime.nnanosecond(address());
        }

        public int day_of_week() {
            return SDL_DateTime.nday_of_week(address());
        }

        public int utc_offset() {
            return SDL_DateTime.nutc_offset(address());
        }

        public Buffer year(int value) {
            SDL_DateTime.nyear(address(), value);
            return this;
        }

        public Buffer month(int value) {
            SDL_DateTime.nmonth(address(), value);
            return this;
        }

        public Buffer day(int value) {
            SDL_DateTime.nday(address(), value);
            return this;
        }

        public Buffer hour(int value) {
            SDL_DateTime.nhour(address(), value);
            return this;
        }

        public Buffer minute(int value) {
            SDL_DateTime.nminute(address(), value);
            return this;
        }

        public Buffer second(int value) {
            SDL_DateTime.nsecond(address(), value);
            return this;
        }

        public Buffer nanosecond(int value) {
            SDL_DateTime.nnanosecond(address(), value);
            return this;
        }

        public Buffer day_of_week(int value) {
            SDL_DateTime.nday_of_week(address(), value);
            return this;
        }

        public Buffer utc_offset(int value) {
            SDL_DateTime.nutc_offset(address(), value);
            return this;
        }
    }
}
