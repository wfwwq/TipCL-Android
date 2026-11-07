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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslVertexAttribute.class
 */
@NativeType("struct spvc_msl_vertex_attribute")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslVertexAttribute.class */
public class SpvcMslVertexAttribute extends Struct<SpvcMslVertexAttribute> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int LOCATION;
    public static final int MSL_BUFFER;
    public static final int MSL_OFFSET;
    public static final int MSL_STRIDE;
    public static final int PER_INSTANCE;
    public static final int FORMAT;
    public static final int BUILTIN;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(1), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        LOCATION = layout.offsetof(0);
        MSL_BUFFER = layout.offsetof(1);
        MSL_OFFSET = layout.offsetof(2);
        MSL_STRIDE = layout.offsetof(3);
        PER_INSTANCE = layout.offsetof(4);
        FORMAT = layout.offsetof(5);
        BUILTIN = layout.offsetof(6);
    }

    protected SpvcMslVertexAttribute(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SpvcMslVertexAttribute create(long address, ByteBuffer container) {
        return new SpvcMslVertexAttribute(address, container);
    }

    public SpvcMslVertexAttribute(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("unsigned int")
    public int location() {
        return nlocation(address());
    }

    @NativeType("unsigned int")
    public int msl_buffer() {
        return nmsl_buffer(address());
    }

    @NativeType("unsigned int")
    public int msl_offset() {
        return nmsl_offset(address());
    }

    @NativeType("unsigned int")
    public int msl_stride() {
        return nmsl_stride(address());
    }

    @NativeType("spvc_bool")
    public boolean per_instance() {
        return nper_instance(address());
    }

    @NativeType("spvc_msl_vertex_format")
    public int format() {
        return nformat(address());
    }

    @NativeType("SpvBuiltIn")
    public int builtin() {
        return nbuiltin(address());
    }

    public SpvcMslVertexAttribute location(@NativeType("unsigned int") int value) {
        nlocation(address(), value);
        return this;
    }

    public SpvcMslVertexAttribute msl_buffer(@NativeType("unsigned int") int value) {
        nmsl_buffer(address(), value);
        return this;
    }

    public SpvcMslVertexAttribute msl_offset(@NativeType("unsigned int") int value) {
        nmsl_offset(address(), value);
        return this;
    }

    public SpvcMslVertexAttribute msl_stride(@NativeType("unsigned int") int value) {
        nmsl_stride(address(), value);
        return this;
    }

    public SpvcMslVertexAttribute per_instance(@NativeType("spvc_bool") boolean value) {
        nper_instance(address(), value);
        return this;
    }

    public SpvcMslVertexAttribute format(@NativeType("spvc_msl_vertex_format") int value) {
        nformat(address(), value);
        return this;
    }

    public SpvcMslVertexAttribute builtin(@NativeType("SpvBuiltIn") int value) {
        nbuiltin(address(), value);
        return this;
    }

    public SpvcMslVertexAttribute set(int location, int msl_buffer, int msl_offset, int msl_stride, boolean per_instance, int format, int builtin) {
        location(location);
        msl_buffer(msl_buffer);
        msl_offset(msl_offset);
        msl_stride(msl_stride);
        per_instance(per_instance);
        format(format);
        builtin(builtin);
        return this;
    }

    public SpvcMslVertexAttribute set(SpvcMslVertexAttribute src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SpvcMslVertexAttribute malloc() {
        return new SpvcMslVertexAttribute(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SpvcMslVertexAttribute calloc() {
        return new SpvcMslVertexAttribute(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SpvcMslVertexAttribute create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpvcMslVertexAttribute(MemoryUtil.memAddress(container), container);
    }

    public static SpvcMslVertexAttribute create(long address) {
        return new SpvcMslVertexAttribute(address, null);
    }

    public static SpvcMslVertexAttribute createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SpvcMslVertexAttribute(address, null);
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

    public static SpvcMslVertexAttribute malloc(MemoryStack stack) {
        return new SpvcMslVertexAttribute(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SpvcMslVertexAttribute calloc(MemoryStack stack) {
        return new SpvcMslVertexAttribute(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nlocation(long struct) {
        return MemoryUtil.memGetInt(struct + LOCATION);
    }

    public static int nmsl_buffer(long struct) {
        return MemoryUtil.memGetInt(struct + MSL_BUFFER);
    }

    public static int nmsl_offset(long struct) {
        return MemoryUtil.memGetInt(struct + MSL_OFFSET);
    }

    public static int nmsl_stride(long struct) {
        return MemoryUtil.memGetInt(struct + MSL_STRIDE);
    }

    public static boolean nper_instance(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) PER_INSTANCE)) != 0;
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static int nbuiltin(long struct) {
        return MemoryUtil.memGetInt(struct + BUILTIN);
    }

    public static void nlocation(long struct, int value) {
        MemoryUtil.memPutInt(struct + LOCATION, value);
    }

    public static void nmsl_buffer(long struct, int value) {
        MemoryUtil.memPutInt(struct + MSL_BUFFER, value);
    }

    public static void nmsl_offset(long struct, int value) {
        MemoryUtil.memPutInt(struct + MSL_OFFSET, value);
    }

    public static void nmsl_stride(long struct, int value) {
        MemoryUtil.memPutInt(struct + MSL_STRIDE, value);
    }

    public static void nper_instance(long struct, boolean value) {
        MemoryUtil.memPutByte(struct + PER_INSTANCE, value ? (byte) 1 : (byte) 0);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    public static void nbuiltin(long struct, int value) {
        MemoryUtil.memPutInt(struct + BUILTIN, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslVertexAttribute$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslVertexAttribute$Buffer.class */
    public static class Buffer extends StructBuffer<SpvcMslVertexAttribute, Buffer> implements NativeResource {
        private static final SpvcMslVertexAttribute ELEMENT_FACTORY = SpvcMslVertexAttribute.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SpvcMslVertexAttribute.SIZEOF);
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
        public SpvcMslVertexAttribute getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("unsigned int")
        public int location() {
            return SpvcMslVertexAttribute.nlocation(address());
        }

        @NativeType("unsigned int")
        public int msl_buffer() {
            return SpvcMslVertexAttribute.nmsl_buffer(address());
        }

        @NativeType("unsigned int")
        public int msl_offset() {
            return SpvcMslVertexAttribute.nmsl_offset(address());
        }

        @NativeType("unsigned int")
        public int msl_stride() {
            return SpvcMslVertexAttribute.nmsl_stride(address());
        }

        @NativeType("spvc_bool")
        public boolean per_instance() {
            return SpvcMslVertexAttribute.nper_instance(address());
        }

        @NativeType("spvc_msl_vertex_format")
        public int format() {
            return SpvcMslVertexAttribute.nformat(address());
        }

        @NativeType("SpvBuiltIn")
        public int builtin() {
            return SpvcMslVertexAttribute.nbuiltin(address());
        }

        public Buffer location(@NativeType("unsigned int") int value) {
            SpvcMslVertexAttribute.nlocation(address(), value);
            return this;
        }

        public Buffer msl_buffer(@NativeType("unsigned int") int value) {
            SpvcMslVertexAttribute.nmsl_buffer(address(), value);
            return this;
        }

        public Buffer msl_offset(@NativeType("unsigned int") int value) {
            SpvcMslVertexAttribute.nmsl_offset(address(), value);
            return this;
        }

        public Buffer msl_stride(@NativeType("unsigned int") int value) {
            SpvcMslVertexAttribute.nmsl_stride(address(), value);
            return this;
        }

        public Buffer per_instance(@NativeType("spvc_bool") boolean value) {
            SpvcMslVertexAttribute.nper_instance(address(), value);
            return this;
        }

        public Buffer format(@NativeType("spvc_msl_vertex_format") int value) {
            SpvcMslVertexAttribute.nformat(address(), value);
            return this;
        }

        public Buffer builtin(@NativeType("SpvBuiltIn") int value) {
            SpvcMslVertexAttribute.nbuiltin(address(), value);
            return this;
        }
    }
}
