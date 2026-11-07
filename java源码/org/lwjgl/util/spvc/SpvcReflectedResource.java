package org.lwjgl.util.spvc;

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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcReflectedResource.class
 */
@NativeType("struct spvc_reflected_resource")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcReflectedResource.class */
public class SpvcReflectedResource extends Struct<SpvcReflectedResource> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ID;
    public static final int BASE_TYPE_ID;
    public static final int TYPE_ID;
    public static final int NAME;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ID = layout.offsetof(0);
        BASE_TYPE_ID = layout.offsetof(1);
        TYPE_ID = layout.offsetof(2);
        NAME = layout.offsetof(3);
    }

    protected SpvcReflectedResource(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SpvcReflectedResource create(long address, ByteBuffer container) {
        return new SpvcReflectedResource(address, container);
    }

    public SpvcReflectedResource(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("spvc_variable_id")
    public int id() {
        return nid(address());
    }

    @NativeType("spvc_type_id")
    public int base_type_id() {
        return nbase_type_id(address());
    }

    @NativeType("spvc_type_id")
    public int type_id() {
        return ntype_id(address());
    }

    @NativeType("char const *")
    public ByteBuffer name() {
        return nname(address());
    }

    @NativeType("char const *")
    public String nameString() {
        return nnameString(address());
    }

    public SpvcReflectedResource id(@NativeType("spvc_variable_id") int value) {
        nid(address(), value);
        return this;
    }

    public SpvcReflectedResource base_type_id(@NativeType("spvc_type_id") int value) {
        nbase_type_id(address(), value);
        return this;
    }

    public SpvcReflectedResource type_id(@NativeType("spvc_type_id") int value) {
        ntype_id(address(), value);
        return this;
    }

    public SpvcReflectedResource name(@NativeType("char const *") ByteBuffer value) {
        nname(address(), value);
        return this;
    }

    public SpvcReflectedResource set(int id, int base_type_id, int type_id, ByteBuffer name) {
        id(id);
        base_type_id(base_type_id);
        type_id(type_id);
        name(name);
        return this;
    }

    public SpvcReflectedResource set(SpvcReflectedResource src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SpvcReflectedResource malloc() {
        return new SpvcReflectedResource(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SpvcReflectedResource calloc() {
        return new SpvcReflectedResource(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SpvcReflectedResource create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpvcReflectedResource(MemoryUtil.memAddress(container), container);
    }

    public static SpvcReflectedResource create(long address) {
        return new SpvcReflectedResource(address, null);
    }

    public static SpvcReflectedResource createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SpvcReflectedResource(address, null);
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

    public static SpvcReflectedResource malloc(MemoryStack stack) {
        return new SpvcReflectedResource(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SpvcReflectedResource calloc(MemoryStack stack) {
        return new SpvcReflectedResource(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nid(long struct) {
        return MemoryUtil.memGetInt(struct + ID);
    }

    public static int nbase_type_id(long struct) {
        return MemoryUtil.memGetInt(struct + BASE_TYPE_ID);
    }

    public static int ntype_id(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE_ID);
    }

    public static ByteBuffer nname(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + NAME));
    }

    public static String nnameString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + NAME));
    }

    public static void nid(long struct, int value) {
        MemoryUtil.memPutInt(struct + ID, value);
    }

    public static void nbase_type_id(long struct, int value) {
        MemoryUtil.memPutInt(struct + BASE_TYPE_ID, value);
    }

    public static void ntype_id(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE_ID, value);
    }

    public static void nname(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + NAME, MemoryUtil.memAddress(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + NAME));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcReflectedResource$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcReflectedResource$Buffer.class */
    public static class Buffer extends StructBuffer<SpvcReflectedResource, Buffer> implements NativeResource {
        private static final SpvcReflectedResource ELEMENT_FACTORY = SpvcReflectedResource.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SpvcReflectedResource.SIZEOF);
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
        public SpvcReflectedResource getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("spvc_variable_id")
        public int id() {
            return SpvcReflectedResource.nid(address());
        }

        @NativeType("spvc_type_id")
        public int base_type_id() {
            return SpvcReflectedResource.nbase_type_id(address());
        }

        @NativeType("spvc_type_id")
        public int type_id() {
            return SpvcReflectedResource.ntype_id(address());
        }

        @NativeType("char const *")
        public ByteBuffer name() {
            return SpvcReflectedResource.nname(address());
        }

        @NativeType("char const *")
        public String nameString() {
            return SpvcReflectedResource.nnameString(address());
        }

        public Buffer id(@NativeType("spvc_variable_id") int value) {
            SpvcReflectedResource.nid(address(), value);
            return this;
        }

        public Buffer base_type_id(@NativeType("spvc_type_id") int value) {
            SpvcReflectedResource.nbase_type_id(address(), value);
            return this;
        }

        public Buffer type_id(@NativeType("spvc_type_id") int value) {
            SpvcReflectedResource.ntype_id(address(), value);
            return this;
        }

        public Buffer name(@NativeType("char const *") ByteBuffer value) {
            SpvcReflectedResource.nname(address(), value);
            return this;
        }
    }
}
