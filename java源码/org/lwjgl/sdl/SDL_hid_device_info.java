package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_hid_device_info.class */
public class SDL_hid_device_info extends Struct<SDL_hid_device_info> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PATH;
    public static final int VENDOR_ID;
    public static final int PRODUCT_ID;
    public static final int SERIAL_NUMBER;
    public static final int RELEASE_NUMBER;
    public static final int MANUFACTURER_STRING;
    public static final int PRODUCT_STRING;
    public static final int USAGE_PAGE;
    public static final int USAGE;
    public static final int INTERFACE_NUMBER;
    public static final int INTERFACE_CLASS;
    public static final int INTERFACE_SUBCLASS;
    public static final int INTERFACE_PROTOCOL;
    public static final int BUS_TYPE;
    public static final int NEXT;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(2), __member(2), __member(POINTER_SIZE), __member(2), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(2), __member(2), __member(4), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PATH = layout.offsetof(0);
        VENDOR_ID = layout.offsetof(1);
        PRODUCT_ID = layout.offsetof(2);
        SERIAL_NUMBER = layout.offsetof(3);
        RELEASE_NUMBER = layout.offsetof(4);
        MANUFACTURER_STRING = layout.offsetof(5);
        PRODUCT_STRING = layout.offsetof(6);
        USAGE_PAGE = layout.offsetof(7);
        USAGE = layout.offsetof(8);
        INTERFACE_NUMBER = layout.offsetof(9);
        INTERFACE_CLASS = layout.offsetof(10);
        INTERFACE_SUBCLASS = layout.offsetof(11);
        INTERFACE_PROTOCOL = layout.offsetof(12);
        BUS_TYPE = layout.offsetof(13);
        NEXT = layout.offsetof(14);
    }

    protected SDL_hid_device_info(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_hid_device_info create(long address, ByteBuffer container) {
        return new SDL_hid_device_info(address, container);
    }

    public SDL_hid_device_info(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("char *")
    public ByteBuffer path() {
        return npath(address());
    }

    @NativeType("char *")
    public String pathString() {
        return npathString(address());
    }

    @NativeType("unsigned short")
    public short vendor_id() {
        return nvendor_id(address());
    }

    @NativeType("unsigned short")
    public short product_id() {
        return nproduct_id(address());
    }

    @NativeType("wchar_t *")
    public ByteBuffer serial_number() {
        return nserial_number(address());
    }

    @NativeType("wchar_t *")
    public String serial_numberString() {
        return nserial_numberString(address());
    }

    @NativeType("unsigned short")
    public short release_number() {
        return nrelease_number(address());
    }

    @NativeType("wchar_t *")
    public ByteBuffer manufacturer_string() {
        return nmanufacturer_string(address());
    }

    @NativeType("wchar_t *")
    public String manufacturer_stringString() {
        return nmanufacturer_stringString(address());
    }

    @NativeType("wchar_t *")
    public ByteBuffer product_string() {
        return nproduct_string(address());
    }

    @NativeType("wchar_t *")
    public String product_stringString() {
        return nproduct_stringString(address());
    }

    @NativeType("unsigned short")
    public short usage_page() {
        return nusage_page(address());
    }

    @NativeType("unsigned short")
    public short usage() {
        return nusage(address());
    }

    public int interface_number() {
        return ninterface_number(address());
    }

    public int interface_class() {
        return ninterface_class(address());
    }

    public int interface_subclass() {
        return ninterface_subclass(address());
    }

    public int interface_protocol() {
        return ninterface_protocol(address());
    }

    @NativeType("SDL_hid_bus_type")
    public int bus_type() {
        return nbus_type(address());
    }

    @NativeType("SDL_hid_device_info *")
    public SDL_hid_device_info next() {
        return nnext(address());
    }

    public SDL_hid_device_info path(@NativeType("char *") ByteBuffer value) {
        npath(address(), value);
        return this;
    }

    public SDL_hid_device_info vendor_id(@NativeType("unsigned short") short value) {
        nvendor_id(address(), value);
        return this;
    }

    public SDL_hid_device_info product_id(@NativeType("unsigned short") short value) {
        nproduct_id(address(), value);
        return this;
    }

    public SDL_hid_device_info serial_number(@NativeType("wchar_t *") ByteBuffer value) {
        nserial_number(address(), value);
        return this;
    }

    public SDL_hid_device_info release_number(@NativeType("unsigned short") short value) {
        nrelease_number(address(), value);
        return this;
    }

    public SDL_hid_device_info manufacturer_string(@NativeType("wchar_t *") ByteBuffer value) {
        nmanufacturer_string(address(), value);
        return this;
    }

    public SDL_hid_device_info product_string(@NativeType("wchar_t *") ByteBuffer value) {
        nproduct_string(address(), value);
        return this;
    }

    public SDL_hid_device_info usage_page(@NativeType("unsigned short") short value) {
        nusage_page(address(), value);
        return this;
    }

    public SDL_hid_device_info usage(@NativeType("unsigned short") short value) {
        nusage(address(), value);
        return this;
    }

    public SDL_hid_device_info interface_number(int value) {
        ninterface_number(address(), value);
        return this;
    }

    public SDL_hid_device_info interface_class(int value) {
        ninterface_class(address(), value);
        return this;
    }

    public SDL_hid_device_info interface_subclass(int value) {
        ninterface_subclass(address(), value);
        return this;
    }

    public SDL_hid_device_info interface_protocol(int value) {
        ninterface_protocol(address(), value);
        return this;
    }

    public SDL_hid_device_info bus_type(@NativeType("SDL_hid_bus_type") int value) {
        nbus_type(address(), value);
        return this;
    }

    public SDL_hid_device_info next(@NativeType("SDL_hid_device_info *") SDL_hid_device_info value) {
        nnext(address(), value);
        return this;
    }

    public SDL_hid_device_info set(ByteBuffer path, short vendor_id, short product_id, ByteBuffer serial_number, short release_number, ByteBuffer manufacturer_string, ByteBuffer product_string, short usage_page, short usage, int interface_number, int interface_class, int interface_subclass, int interface_protocol, int bus_type, SDL_hid_device_info next) {
        path(path);
        vendor_id(vendor_id);
        product_id(product_id);
        serial_number(serial_number);
        release_number(release_number);
        manufacturer_string(manufacturer_string);
        product_string(product_string);
        usage_page(usage_page);
        usage(usage);
        interface_number(interface_number);
        interface_class(interface_class);
        interface_subclass(interface_subclass);
        interface_protocol(interface_protocol);
        bus_type(bus_type);
        next(next);
        return this;
    }

    public SDL_hid_device_info set(SDL_hid_device_info src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_hid_device_info malloc() {
        return new SDL_hid_device_info(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_hid_device_info calloc() {
        return new SDL_hid_device_info(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_hid_device_info create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_hid_device_info(MemoryUtil.memAddress(container), container);
    }

    public static SDL_hid_device_info create(long address) {
        return new SDL_hid_device_info(address, null);
    }

    public static SDL_hid_device_info createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_hid_device_info(address, null);
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

    public static SDL_hid_device_info malloc(MemoryStack stack) {
        return new SDL_hid_device_info(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_hid_device_info calloc(MemoryStack stack) {
        return new SDL_hid_device_info(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer npath(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + PATH));
    }

    public static String npathString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + PATH));
    }

    public static short nvendor_id(long struct) {
        return MemoryUtil.memGetShort(struct + VENDOR_ID);
    }

    public static short nproduct_id(long struct) {
        return MemoryUtil.memGetShort(struct + PRODUCT_ID);
    }

    public static ByteBuffer nserial_number(long struct) {
        return MemoryUtil.memByteBufferNT2(MemoryUtil.memGetAddress(struct + SERIAL_NUMBER));
    }

    public static String nserial_numberString(long struct) {
        return MemoryUtil.memUTF16(MemoryUtil.memGetAddress(struct + SERIAL_NUMBER));
    }

    public static short nrelease_number(long struct) {
        return MemoryUtil.memGetShort(struct + RELEASE_NUMBER);
    }

    public static ByteBuffer nmanufacturer_string(long struct) {
        return MemoryUtil.memByteBufferNT2(MemoryUtil.memGetAddress(struct + MANUFACTURER_STRING));
    }

    public static String nmanufacturer_stringString(long struct) {
        return MemoryUtil.memUTF16(MemoryUtil.memGetAddress(struct + MANUFACTURER_STRING));
    }

    public static ByteBuffer nproduct_string(long struct) {
        return MemoryUtil.memByteBufferNT2(MemoryUtil.memGetAddress(struct + PRODUCT_STRING));
    }

    public static String nproduct_stringString(long struct) {
        return MemoryUtil.memUTF16(MemoryUtil.memGetAddress(struct + PRODUCT_STRING));
    }

    public static short nusage_page(long struct) {
        return MemoryUtil.memGetShort(struct + USAGE_PAGE);
    }

    public static short nusage(long struct) {
        return MemoryUtil.memGetShort(struct + USAGE);
    }

    public static int ninterface_number(long struct) {
        return MemoryUtil.memGetInt(struct + INTERFACE_NUMBER);
    }

    public static int ninterface_class(long struct) {
        return MemoryUtil.memGetInt(struct + INTERFACE_CLASS);
    }

    public static int ninterface_subclass(long struct) {
        return MemoryUtil.memGetInt(struct + INTERFACE_SUBCLASS);
    }

    public static int ninterface_protocol(long struct) {
        return MemoryUtil.memGetInt(struct + INTERFACE_PROTOCOL);
    }

    public static int nbus_type(long struct) {
        return MemoryUtil.memGetInt(struct + BUS_TYPE);
    }

    public static SDL_hid_device_info nnext(long struct) {
        return create(MemoryUtil.memGetAddress(struct + NEXT));
    }

    public static void npath(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + PATH, MemoryUtil.memAddress(value));
    }

    public static void nvendor_id(long struct, short value) {
        MemoryUtil.memPutShort(struct + VENDOR_ID, value);
    }

    public static void nproduct_id(long struct, short value) {
        MemoryUtil.memPutShort(struct + PRODUCT_ID, value);
    }

    public static void nserial_number(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT2(value);
        }
        MemoryUtil.memPutAddress(struct + SERIAL_NUMBER, MemoryUtil.memAddress(value));
    }

    public static void nrelease_number(long struct, short value) {
        MemoryUtil.memPutShort(struct + RELEASE_NUMBER, value);
    }

    public static void nmanufacturer_string(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT2(value);
        }
        MemoryUtil.memPutAddress(struct + MANUFACTURER_STRING, MemoryUtil.memAddress(value));
    }

    public static void nproduct_string(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT2(value);
        }
        MemoryUtil.memPutAddress(struct + PRODUCT_STRING, MemoryUtil.memAddress(value));
    }

    public static void nusage_page(long struct, short value) {
        MemoryUtil.memPutShort(struct + USAGE_PAGE, value);
    }

    public static void nusage(long struct, short value) {
        MemoryUtil.memPutShort(struct + USAGE, value);
    }

    public static void ninterface_number(long struct, int value) {
        MemoryUtil.memPutInt(struct + INTERFACE_NUMBER, value);
    }

    public static void ninterface_class(long struct, int value) {
        MemoryUtil.memPutInt(struct + INTERFACE_CLASS, value);
    }

    public static void ninterface_subclass(long struct, int value) {
        MemoryUtil.memPutInt(struct + INTERFACE_SUBCLASS, value);
    }

    public static void ninterface_protocol(long struct, int value) {
        MemoryUtil.memPutInt(struct + INTERFACE_PROTOCOL, value);
    }

    public static void nbus_type(long struct, int value) {
        MemoryUtil.memPutInt(struct + BUS_TYPE, value);
    }

    public static void nnext(long struct, SDL_hid_device_info value) {
        MemoryUtil.memPutAddress(struct + NEXT, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PATH));
        Checks.check(MemoryUtil.memGetAddress(struct + SERIAL_NUMBER));
        Checks.check(MemoryUtil.memGetAddress(struct + MANUFACTURER_STRING));
        Checks.check(MemoryUtil.memGetAddress(struct + PRODUCT_STRING));
        Checks.check(MemoryUtil.memGetAddress(struct + NEXT));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_hid_device_info$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_hid_device_info, Buffer> implements NativeResource {
        private static final SDL_hid_device_info ELEMENT_FACTORY = SDL_hid_device_info.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_hid_device_info.SIZEOF);
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
        public SDL_hid_device_info getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("char *")
        public ByteBuffer path() {
            return SDL_hid_device_info.npath(address());
        }

        @NativeType("char *")
        public String pathString() {
            return SDL_hid_device_info.npathString(address());
        }

        @NativeType("unsigned short")
        public short vendor_id() {
            return SDL_hid_device_info.nvendor_id(address());
        }

        @NativeType("unsigned short")
        public short product_id() {
            return SDL_hid_device_info.nproduct_id(address());
        }

        @NativeType("wchar_t *")
        public ByteBuffer serial_number() {
            return SDL_hid_device_info.nserial_number(address());
        }

        @NativeType("wchar_t *")
        public String serial_numberString() {
            return SDL_hid_device_info.nserial_numberString(address());
        }

        @NativeType("unsigned short")
        public short release_number() {
            return SDL_hid_device_info.nrelease_number(address());
        }

        @NativeType("wchar_t *")
        public ByteBuffer manufacturer_string() {
            return SDL_hid_device_info.nmanufacturer_string(address());
        }

        @NativeType("wchar_t *")
        public String manufacturer_stringString() {
            return SDL_hid_device_info.nmanufacturer_stringString(address());
        }

        @NativeType("wchar_t *")
        public ByteBuffer product_string() {
            return SDL_hid_device_info.nproduct_string(address());
        }

        @NativeType("wchar_t *")
        public String product_stringString() {
            return SDL_hid_device_info.nproduct_stringString(address());
        }

        @NativeType("unsigned short")
        public short usage_page() {
            return SDL_hid_device_info.nusage_page(address());
        }

        @NativeType("unsigned short")
        public short usage() {
            return SDL_hid_device_info.nusage(address());
        }

        public int interface_number() {
            return SDL_hid_device_info.ninterface_number(address());
        }

        public int interface_class() {
            return SDL_hid_device_info.ninterface_class(address());
        }

        public int interface_subclass() {
            return SDL_hid_device_info.ninterface_subclass(address());
        }

        public int interface_protocol() {
            return SDL_hid_device_info.ninterface_protocol(address());
        }

        @NativeType("SDL_hid_bus_type")
        public int bus_type() {
            return SDL_hid_device_info.nbus_type(address());
        }

        @NativeType("SDL_hid_device_info *")
        public SDL_hid_device_info next() {
            return SDL_hid_device_info.nnext(address());
        }

        public Buffer path(@NativeType("char *") ByteBuffer value) {
            SDL_hid_device_info.npath(address(), value);
            return this;
        }

        public Buffer vendor_id(@NativeType("unsigned short") short value) {
            SDL_hid_device_info.nvendor_id(address(), value);
            return this;
        }

        public Buffer product_id(@NativeType("unsigned short") short value) {
            SDL_hid_device_info.nproduct_id(address(), value);
            return this;
        }

        public Buffer serial_number(@NativeType("wchar_t *") ByteBuffer value) {
            SDL_hid_device_info.nserial_number(address(), value);
            return this;
        }

        public Buffer release_number(@NativeType("unsigned short") short value) {
            SDL_hid_device_info.nrelease_number(address(), value);
            return this;
        }

        public Buffer manufacturer_string(@NativeType("wchar_t *") ByteBuffer value) {
            SDL_hid_device_info.nmanufacturer_string(address(), value);
            return this;
        }

        public Buffer product_string(@NativeType("wchar_t *") ByteBuffer value) {
            SDL_hid_device_info.nproduct_string(address(), value);
            return this;
        }

        public Buffer usage_page(@NativeType("unsigned short") short value) {
            SDL_hid_device_info.nusage_page(address(), value);
            return this;
        }

        public Buffer usage(@NativeType("unsigned short") short value) {
            SDL_hid_device_info.nusage(address(), value);
            return this;
        }

        public Buffer interface_number(int value) {
            SDL_hid_device_info.ninterface_number(address(), value);
            return this;
        }

        public Buffer interface_class(int value) {
            SDL_hid_device_info.ninterface_class(address(), value);
            return this;
        }

        public Buffer interface_subclass(int value) {
            SDL_hid_device_info.ninterface_subclass(address(), value);
            return this;
        }

        public Buffer interface_protocol(int value) {
            SDL_hid_device_info.ninterface_protocol(address(), value);
            return this;
        }

        public Buffer bus_type(@NativeType("SDL_hid_bus_type") int value) {
            SDL_hid_device_info.nbus_type(address(), value);
            return this;
        }

        public Buffer next(@NativeType("SDL_hid_device_info *") SDL_hid_device_info value) {
            SDL_hid_device_info.nnext(address(), value);
            return this;
        }
    }
}
