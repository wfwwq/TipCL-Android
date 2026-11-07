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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcEntryPoint.class
 */
@NativeType("struct spvc_entry_point")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcEntryPoint.class */
public class SpvcEntryPoint extends Struct<SpvcEntryPoint> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int EXECUTION_MODEL;
    public static final int NAME;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        EXECUTION_MODEL = layout.offsetof(0);
        NAME = layout.offsetof(1);
    }

    protected SpvcEntryPoint(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SpvcEntryPoint create(long address, ByteBuffer container) {
        return new SpvcEntryPoint(address, container);
    }

    public SpvcEntryPoint(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SpvExecutionModel")
    public int execution_model() {
        return nexecution_model(address());
    }

    @NativeType("char const *")
    public ByteBuffer name() {
        return nname(address());
    }

    @NativeType("char const *")
    public String nameString() {
        return nnameString(address());
    }

    public SpvcEntryPoint execution_model(@NativeType("SpvExecutionModel") int value) {
        nexecution_model(address(), value);
        return this;
    }

    public SpvcEntryPoint name(@NativeType("char const *") ByteBuffer value) {
        nname(address(), value);
        return this;
    }

    public SpvcEntryPoint set(int execution_model, ByteBuffer name) {
        execution_model(execution_model);
        name(name);
        return this;
    }

    public SpvcEntryPoint set(SpvcEntryPoint src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SpvcEntryPoint malloc() {
        return new SpvcEntryPoint(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SpvcEntryPoint calloc() {
        return new SpvcEntryPoint(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SpvcEntryPoint create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpvcEntryPoint(MemoryUtil.memAddress(container), container);
    }

    public static SpvcEntryPoint create(long address) {
        return new SpvcEntryPoint(address, null);
    }

    public static SpvcEntryPoint createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SpvcEntryPoint(address, null);
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

    public static SpvcEntryPoint malloc(MemoryStack stack) {
        return new SpvcEntryPoint(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SpvcEntryPoint calloc(MemoryStack stack) {
        return new SpvcEntryPoint(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nexecution_model(long struct) {
        return MemoryUtil.memGetInt(struct + EXECUTION_MODEL);
    }

    public static ByteBuffer nname(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + NAME));
    }

    public static String nnameString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + NAME));
    }

    public static void nexecution_model(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXECUTION_MODEL, value);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcEntryPoint$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcEntryPoint$Buffer.class */
    public static class Buffer extends StructBuffer<SpvcEntryPoint, Buffer> implements NativeResource {
        private static final SpvcEntryPoint ELEMENT_FACTORY = SpvcEntryPoint.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SpvcEntryPoint.SIZEOF);
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
        public SpvcEntryPoint getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SpvExecutionModel")
        public int execution_model() {
            return SpvcEntryPoint.nexecution_model(address());
        }

        @NativeType("char const *")
        public ByteBuffer name() {
            return SpvcEntryPoint.nname(address());
        }

        @NativeType("char const *")
        public String nameString() {
            return SpvcEntryPoint.nnameString(address());
        }

        public Buffer execution_model(@NativeType("SpvExecutionModel") int value) {
            SpvcEntryPoint.nexecution_model(address(), value);
            return this;
        }

        public Buffer name(@NativeType("char const *") ByteBuffer value) {
            SpvcEntryPoint.nname(address(), value);
            return this;
        }
    }
}
