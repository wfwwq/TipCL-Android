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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslShaderInput.class
 */
@NativeType("struct spvc_msl_shader_input")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslShaderInput.class */
public class SpvcMslShaderInput extends Struct<SpvcMslShaderInput> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int LOCATION;
    public static final int FORMAT;
    public static final int BUILTIN;
    public static final int VECSIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        LOCATION = layout.offsetof(0);
        FORMAT = layout.offsetof(1);
        BUILTIN = layout.offsetof(2);
        VECSIZE = layout.offsetof(3);
    }

    protected SpvcMslShaderInput(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SpvcMslShaderInput create(long address, ByteBuffer container) {
        return new SpvcMslShaderInput(address, container);
    }

    public SpvcMslShaderInput(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("unsigned")
    public int location() {
        return nlocation(address());
    }

    @NativeType("spvc_msl_vertex_format")
    public int format() {
        return nformat(address());
    }

    @NativeType("SpvBuiltIn")
    public int builtin() {
        return nbuiltin(address());
    }

    @NativeType("unsigned")
    public int vecsize() {
        return nvecsize(address());
    }

    public SpvcMslShaderInput location(@NativeType("unsigned") int value) {
        nlocation(address(), value);
        return this;
    }

    public SpvcMslShaderInput format(@NativeType("spvc_msl_vertex_format") int value) {
        nformat(address(), value);
        return this;
    }

    public SpvcMslShaderInput builtin(@NativeType("SpvBuiltIn") int value) {
        nbuiltin(address(), value);
        return this;
    }

    public SpvcMslShaderInput vecsize(@NativeType("unsigned") int value) {
        nvecsize(address(), value);
        return this;
    }

    public SpvcMslShaderInput set(int location, int format, int builtin, int vecsize) {
        location(location);
        format(format);
        builtin(builtin);
        vecsize(vecsize);
        return this;
    }

    public SpvcMslShaderInput set(SpvcMslShaderInput src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SpvcMslShaderInput malloc() {
        return new SpvcMslShaderInput(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SpvcMslShaderInput calloc() {
        return new SpvcMslShaderInput(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SpvcMslShaderInput create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpvcMslShaderInput(MemoryUtil.memAddress(container), container);
    }

    public static SpvcMslShaderInput create(long address) {
        return new SpvcMslShaderInput(address, null);
    }

    public static SpvcMslShaderInput createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SpvcMslShaderInput(address, null);
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

    public static SpvcMslShaderInput malloc(MemoryStack stack) {
        return new SpvcMslShaderInput(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SpvcMslShaderInput calloc(MemoryStack stack) {
        return new SpvcMslShaderInput(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static int nbuiltin(long struct) {
        return MemoryUtil.memGetInt(struct + BUILTIN);
    }

    public static int nvecsize(long struct) {
        return MemoryUtil.memGetInt(struct + VECSIZE);
    }

    public static void nlocation(long struct, int value) {
        MemoryUtil.memPutInt(struct + LOCATION, value);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    public static void nbuiltin(long struct, int value) {
        MemoryUtil.memPutInt(struct + BUILTIN, value);
    }

    public static void nvecsize(long struct, int value) {
        MemoryUtil.memPutInt(struct + VECSIZE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslShaderInput$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcMslShaderInput$Buffer.class */
    public static class Buffer extends StructBuffer<SpvcMslShaderInput, Buffer> implements NativeResource {
        private static final SpvcMslShaderInput ELEMENT_FACTORY = SpvcMslShaderInput.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SpvcMslShaderInput.SIZEOF);
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
        public SpvcMslShaderInput getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("unsigned")
        public int location() {
            return SpvcMslShaderInput.nlocation(address());
        }

        @NativeType("spvc_msl_vertex_format")
        public int format() {
            return SpvcMslShaderInput.nformat(address());
        }

        @NativeType("SpvBuiltIn")
        public int builtin() {
            return SpvcMslShaderInput.nbuiltin(address());
        }

        @NativeType("unsigned")
        public int vecsize() {
            return SpvcMslShaderInput.nvecsize(address());
        }

        public Buffer location(@NativeType("unsigned") int value) {
            SpvcMslShaderInput.nlocation(address(), value);
            return this;
        }

        public Buffer format(@NativeType("spvc_msl_vertex_format") int value) {
            SpvcMslShaderInput.nformat(address(), value);
            return this;
        }

        public Buffer builtin(@NativeType("SpvBuiltIn") int value) {
            SpvcMslShaderInput.nbuiltin(address(), value);
            return this;
        }

        public Buffer vecsize(@NativeType("unsigned") int value) {
            SpvcMslShaderInput.nvecsize(address(), value);
            return this;
        }
    }
}
