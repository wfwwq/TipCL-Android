package org.lwjgl.system.macosx;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/macosx/ObjCMethodDescription.class
 */
@NativeType("struct objc_method_description")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/macosx/ObjCMethodDescription.class */
public class ObjCMethodDescription extends Struct<ObjCMethodDescription> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NAME;
    public static final int TYPES;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NAME = layout.offsetof(0);
        TYPES = layout.offsetof(1);
    }

    protected ObjCMethodDescription(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public ObjCMethodDescription create(long address, ByteBuffer container) {
        return new ObjCMethodDescription(address, container);
    }

    public ObjCMethodDescription(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SEL")
    public long name() {
        return nname(address());
    }

    @NativeType("char *")
    public ByteBuffer types() {
        return ntypes(address());
    }

    @NativeType("char *")
    public String typesString() {
        return ntypesString(address());
    }

    public static ObjCMethodDescription malloc() {
        return new ObjCMethodDescription(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static ObjCMethodDescription calloc() {
        return new ObjCMethodDescription(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static ObjCMethodDescription create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ObjCMethodDescription(MemoryUtil.memAddress(container), container);
    }

    public static ObjCMethodDescription create(long address) {
        return new ObjCMethodDescription(address, null);
    }

    public static ObjCMethodDescription createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new ObjCMethodDescription(address, null);
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

    public static ObjCMethodDescription malloc(MemoryStack stack) {
        return new ObjCMethodDescription(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static ObjCMethodDescription calloc(MemoryStack stack) {
        return new ObjCMethodDescription(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nname(long struct) {
        return MemoryUtil.memGetAddress(struct + NAME);
    }

    public static ByteBuffer ntypes(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + TYPES));
    }

    public static String ntypesString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + TYPES));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/macosx/ObjCMethodDescription$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/macosx/ObjCMethodDescription$Buffer.class */
    public static class Buffer extends StructBuffer<ObjCMethodDescription, Buffer> implements NativeResource {
        private static final ObjCMethodDescription ELEMENT_FACTORY = ObjCMethodDescription.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / ObjCMethodDescription.SIZEOF);
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
        public ObjCMethodDescription getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SEL")
        public long name() {
            return ObjCMethodDescription.nname(address());
        }

        @NativeType("char *")
        public ByteBuffer types() {
            return ObjCMethodDescription.ntypes(address());
        }

        @NativeType("char *")
        public String typesString() {
            return ObjCMethodDescription.ntypesString(address());
        }
    }
}
