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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcHlslRootConstants.class
 */
@NativeType("struct spvc_hlsl_root_constants")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcHlslRootConstants.class */
public class SpvcHlslRootConstants extends Struct<SpvcHlslRootConstants> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int START;
    public static final int END;
    public static final int BINDING;
    public static final int SPACE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        START = layout.offsetof(0);
        END = layout.offsetof(1);
        BINDING = layout.offsetof(2);
        SPACE = layout.offsetof(3);
    }

    protected SpvcHlslRootConstants(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SpvcHlslRootConstants create(long address, ByteBuffer container) {
        return new SpvcHlslRootConstants(address, container);
    }

    public SpvcHlslRootConstants(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("unsigned int")
    public int start() {
        return nstart(address());
    }

    @NativeType("unsigned int")
    public int end() {
        return nend(address());
    }

    @NativeType("unsigned int")
    public int binding() {
        return nbinding(address());
    }

    @NativeType("unsigned int")
    public int space() {
        return nspace(address());
    }

    public SpvcHlslRootConstants start(@NativeType("unsigned int") int value) {
        nstart(address(), value);
        return this;
    }

    public SpvcHlslRootConstants end(@NativeType("unsigned int") int value) {
        nend(address(), value);
        return this;
    }

    public SpvcHlslRootConstants binding(@NativeType("unsigned int") int value) {
        nbinding(address(), value);
        return this;
    }

    public SpvcHlslRootConstants space(@NativeType("unsigned int") int value) {
        nspace(address(), value);
        return this;
    }

    public SpvcHlslRootConstants set(int start, int end, int binding, int space) {
        start(start);
        end(end);
        binding(binding);
        space(space);
        return this;
    }

    public SpvcHlslRootConstants set(SpvcHlslRootConstants src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SpvcHlslRootConstants malloc() {
        return new SpvcHlslRootConstants(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SpvcHlslRootConstants calloc() {
        return new SpvcHlslRootConstants(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SpvcHlslRootConstants create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpvcHlslRootConstants(MemoryUtil.memAddress(container), container);
    }

    public static SpvcHlslRootConstants create(long address) {
        return new SpvcHlslRootConstants(address, null);
    }

    public static SpvcHlslRootConstants createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SpvcHlslRootConstants(address, null);
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

    public static SpvcHlslRootConstants malloc(MemoryStack stack) {
        return new SpvcHlslRootConstants(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SpvcHlslRootConstants calloc(MemoryStack stack) {
        return new SpvcHlslRootConstants(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nstart(long struct) {
        return MemoryUtil.memGetInt(struct + START);
    }

    public static int nend(long struct) {
        return MemoryUtil.memGetInt(struct + END);
    }

    public static int nbinding(long struct) {
        return MemoryUtil.memGetInt(struct + BINDING);
    }

    public static int nspace(long struct) {
        return MemoryUtil.memGetInt(struct + SPACE);
    }

    public static void nstart(long struct, int value) {
        MemoryUtil.memPutInt(struct + START, value);
    }

    public static void nend(long struct, int value) {
        MemoryUtil.memPutInt(struct + END, value);
    }

    public static void nbinding(long struct, int value) {
        MemoryUtil.memPutInt(struct + BINDING, value);
    }

    public static void nspace(long struct, int value) {
        MemoryUtil.memPutInt(struct + SPACE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcHlslRootConstants$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcHlslRootConstants$Buffer.class */
    public static class Buffer extends StructBuffer<SpvcHlslRootConstants, Buffer> implements NativeResource {
        private static final SpvcHlslRootConstants ELEMENT_FACTORY = SpvcHlslRootConstants.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SpvcHlslRootConstants.SIZEOF);
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
        public SpvcHlslRootConstants getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("unsigned int")
        public int start() {
            return SpvcHlslRootConstants.nstart(address());
        }

        @NativeType("unsigned int")
        public int end() {
            return SpvcHlslRootConstants.nend(address());
        }

        @NativeType("unsigned int")
        public int binding() {
            return SpvcHlslRootConstants.nbinding(address());
        }

        @NativeType("unsigned int")
        public int space() {
            return SpvcHlslRootConstants.nspace(address());
        }

        public Buffer start(@NativeType("unsigned int") int value) {
            SpvcHlslRootConstants.nstart(address(), value);
            return this;
        }

        public Buffer end(@NativeType("unsigned int") int value) {
            SpvcHlslRootConstants.nend(address(), value);
            return this;
        }

        public Buffer binding(@NativeType("unsigned int") int value) {
            SpvcHlslRootConstants.nbinding(address(), value);
            return this;
        }

        public Buffer space(@NativeType("unsigned int") int value) {
            SpvcHlslRootConstants.nspace(address(), value);
            return this;
        }
    }
}
