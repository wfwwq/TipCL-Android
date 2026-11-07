package org.lwjgl.util.spvc;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcSpecializationConstant.class
 */
@NativeType("struct spvc_specialization_constant")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcSpecializationConstant.class */
public class SpvcSpecializationConstant extends Struct<SpvcSpecializationConstant> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ID;
    public static final int CONSTANT_ID;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ID = layout.offsetof(0);
        CONSTANT_ID = layout.offsetof(1);
    }

    protected SpvcSpecializationConstant(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SpvcSpecializationConstant create(long address, ByteBuffer container) {
        return new SpvcSpecializationConstant(address, container);
    }

    public SpvcSpecializationConstant(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("spvc_constant_id")
    public int id() {
        return nid(address());
    }

    @NativeType("unsigned int")
    public int constant_id() {
        return nconstant_id(address());
    }

    public SpvcSpecializationConstant id(@NativeType("spvc_constant_id") int value) {
        nid(address(), value);
        return this;
    }

    public SpvcSpecializationConstant constant_id(@NativeType("unsigned int") int value) {
        nconstant_id(address(), value);
        return this;
    }

    public SpvcSpecializationConstant set(int id, int constant_id) {
        id(id);
        constant_id(constant_id);
        return this;
    }

    public SpvcSpecializationConstant set(SpvcSpecializationConstant src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SpvcSpecializationConstant malloc() {
        return new SpvcSpecializationConstant(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SpvcSpecializationConstant calloc() {
        return new SpvcSpecializationConstant(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SpvcSpecializationConstant create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpvcSpecializationConstant(MemoryUtil.memAddress(container), container);
    }

    public static SpvcSpecializationConstant create(long address) {
        return new SpvcSpecializationConstant(address, null);
    }

    public static SpvcSpecializationConstant createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SpvcSpecializationConstant(address, null);
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

    public static SpvcSpecializationConstant malloc(MemoryStack stack) {
        return new SpvcSpecializationConstant(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SpvcSpecializationConstant calloc(MemoryStack stack) {
        return new SpvcSpecializationConstant(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nconstant_id(long struct) {
        return MemoryUtil.memGetInt(struct + CONSTANT_ID);
    }

    public static void nid(long struct, int value) {
        MemoryUtil.memPutInt(struct + ID, value);
    }

    public static void nconstant_id(long struct, int value) {
        MemoryUtil.memPutInt(struct + CONSTANT_ID, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcSpecializationConstant$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcSpecializationConstant$Buffer.class */
    public static class Buffer extends StructBuffer<SpvcSpecializationConstant, Buffer> implements NativeResource {
        private static final SpvcSpecializationConstant ELEMENT_FACTORY = SpvcSpecializationConstant.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SpvcSpecializationConstant.SIZEOF);
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
        public SpvcSpecializationConstant getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("spvc_constant_id")
        public int id() {
            return SpvcSpecializationConstant.nid(address());
        }

        @NativeType("unsigned int")
        public int constant_id() {
            return SpvcSpecializationConstant.nconstant_id(address());
        }

        public Buffer id(@NativeType("spvc_constant_id") int value) {
            SpvcSpecializationConstant.nid(address(), value);
            return this;
        }

        public Buffer constant_id(@NativeType("unsigned int") int value) {
            SpvcSpecializationConstant.nconstant_id(address(), value);
            return this;
        }
    }
}
