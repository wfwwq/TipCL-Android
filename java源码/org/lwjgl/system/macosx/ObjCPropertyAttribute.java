package org.lwjgl.system.macosx;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/macosx/ObjCPropertyAttribute.class
 */
@NativeType("struct objc_property_attribute_t")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/macosx/ObjCPropertyAttribute.class */
public class ObjCPropertyAttribute extends Struct<ObjCPropertyAttribute> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NAME;
    public static final int VALUE;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NAME = layout.offsetof(0);
        VALUE = layout.offsetof(1);
    }

    protected ObjCPropertyAttribute(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public ObjCPropertyAttribute create(long address, ByteBuffer container) {
        return new ObjCPropertyAttribute(address, container);
    }

    public ObjCPropertyAttribute(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("char *")
    public ByteBuffer name() {
        return nname(address());
    }

    @NativeType("char *")
    public String nameString() {
        return nnameString(address());
    }

    @NativeType("char *")
    public ByteBuffer value() {
        return nvalue(address());
    }

    @NativeType("char *")
    public String valueString() {
        return nvalueString(address());
    }

    public ObjCPropertyAttribute name(@NativeType("char *") ByteBuffer value) {
        nname(address(), value);
        return this;
    }

    public ObjCPropertyAttribute value(@NativeType("char *") ByteBuffer value) {
        nvalue(address(), value);
        return this;
    }

    public ObjCPropertyAttribute set(ByteBuffer name, ByteBuffer value) {
        name(name);
        value(value);
        return this;
    }

    public ObjCPropertyAttribute set(ObjCPropertyAttribute src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static ObjCPropertyAttribute malloc() {
        return new ObjCPropertyAttribute(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static ObjCPropertyAttribute calloc() {
        return new ObjCPropertyAttribute(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static ObjCPropertyAttribute create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ObjCPropertyAttribute(MemoryUtil.memAddress(container), container);
    }

    public static ObjCPropertyAttribute create(long address) {
        return new ObjCPropertyAttribute(address, null);
    }

    public static ObjCPropertyAttribute createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new ObjCPropertyAttribute(address, null);
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

    public static ObjCPropertyAttribute malloc(MemoryStack stack) {
        return new ObjCPropertyAttribute(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static ObjCPropertyAttribute calloc(MemoryStack stack) {
        return new ObjCPropertyAttribute(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer nname(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + NAME));
    }

    public static String nnameString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + NAME));
    }

    public static ByteBuffer nvalue(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + VALUE));
    }

    public static String nvalueString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + VALUE));
    }

    public static void nname(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + NAME, MemoryUtil.memAddress(value));
    }

    public static void nvalue(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + VALUE, MemoryUtil.memAddress(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + NAME));
        Checks.check(MemoryUtil.memGetAddress(struct + VALUE));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/macosx/ObjCPropertyAttribute$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/macosx/ObjCPropertyAttribute$Buffer.class */
    public static class Buffer extends StructBuffer<ObjCPropertyAttribute, Buffer> implements NativeResource {
        private static final ObjCPropertyAttribute ELEMENT_FACTORY = ObjCPropertyAttribute.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / ObjCPropertyAttribute.SIZEOF);
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
        public ObjCPropertyAttribute getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("char *")
        public ByteBuffer name() {
            return ObjCPropertyAttribute.nname(address());
        }

        @NativeType("char *")
        public String nameString() {
            return ObjCPropertyAttribute.nnameString(address());
        }

        @NativeType("char *")
        public ByteBuffer value() {
            return ObjCPropertyAttribute.nvalue(address());
        }

        @NativeType("char *")
        public String valueString() {
            return ObjCPropertyAttribute.nvalueString(address());
        }

        public Buffer name(@NativeType("char *") ByteBuffer value) {
            ObjCPropertyAttribute.nname(address(), value);
            return this;
        }

        public Buffer value(@NativeType("char *") ByteBuffer value) {
            ObjCPropertyAttribute.nvalue(address(), value);
            return this;
        }
    }
}
