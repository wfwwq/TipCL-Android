package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/BDF_Property.class
 */
@NativeType("struct BDF_PropertyRec")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/BDF_Property.class */
public class BDF_Property extends Struct<BDF_Property> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int U;
    public static final int U_ATOM;
    public static final int U_INTEGER;
    public static final int U_CARDINAL;

    static {
        Struct.Layout layout = __struct(__member(4), __union(__member(POINTER_SIZE), __member(4), __member(4)));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        U = layout.offsetof(1);
        U_ATOM = layout.offsetof(2);
        U_INTEGER = layout.offsetof(3);
        U_CARDINAL = layout.offsetof(4);
    }

    protected BDF_Property(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public BDF_Property create(long address, ByteBuffer container) {
        return new BDF_Property(address, container);
    }

    public BDF_Property(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("BDF_PropertyType")
    public int type() {
        return ntype(address());
    }

    @NativeType("char const *")
    public ByteBuffer u_atom() {
        return nu_atom(address());
    }

    @NativeType("char const *")
    public String u_atomString() {
        return nu_atomString(address());
    }

    @NativeType("FT_Int32")
    public int u_integer() {
        return nu_integer(address());
    }

    @NativeType("FT_UInt32")
    public int u_cardinal() {
        return nu_cardinal(address());
    }

    public static BDF_Property malloc() {
        return new BDF_Property(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static BDF_Property calloc() {
        return new BDF_Property(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static BDF_Property create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new BDF_Property(MemoryUtil.memAddress(container), container);
    }

    public static BDF_Property create(long address) {
        return new BDF_Property(address, null);
    }

    public static BDF_Property createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new BDF_Property(address, null);
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

    public static BDF_Property malloc(MemoryStack stack) {
        return new BDF_Property(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static BDF_Property calloc(MemoryStack stack) {
        return new BDF_Property(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static ByteBuffer nu_atom(long struct) {
        return MemoryUtil.memByteBufferNT1Safe(MemoryUtil.memGetAddress(struct + U_ATOM));
    }

    public static String nu_atomString(long struct) {
        return MemoryUtil.memASCIISafe(MemoryUtil.memGetAddress(struct + U_ATOM));
    }

    public static int nu_integer(long struct) {
        return MemoryUtil.memGetInt(struct + U_INTEGER);
    }

    public static int nu_cardinal(long struct) {
        return MemoryUtil.memGetInt(struct + U_CARDINAL);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/BDF_Property$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/BDF_Property$Buffer.class */
    public static class Buffer extends StructBuffer<BDF_Property, Buffer> implements NativeResource {
        private static final BDF_Property ELEMENT_FACTORY = BDF_Property.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / BDF_Property.SIZEOF);
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
        public BDF_Property getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("BDF_PropertyType")
        public int type() {
            return BDF_Property.ntype(address());
        }

        @NativeType("char const *")
        public ByteBuffer u_atom() {
            return BDF_Property.nu_atom(address());
        }

        @NativeType("char const *")
        public String u_atomString() {
            return BDF_Property.nu_atomString(address());
        }

        @NativeType("FT_Int32")
        public int u_integer() {
            return BDF_Property.nu_integer(address());
        }

        @NativeType("FT_UInt32")
        public int u_cardinal() {
            return BDF_Property.nu_cardinal(address());
        }
    }
}
