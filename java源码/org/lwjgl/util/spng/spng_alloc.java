package org.lwjgl.util.spng;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spng_alloc")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_alloc.class */
public class spng_alloc extends Struct<spng_alloc> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MALLOC_FN;
    public static final int REALLOC_FN;
    public static final int CALLOC_FN;
    public static final int FREE_FN;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MALLOC_FN = layout.offsetof(0);
        REALLOC_FN = layout.offsetof(1);
        CALLOC_FN = layout.offsetof(2);
        FREE_FN = layout.offsetof(3);
    }

    protected spng_alloc(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public spng_alloc create(long address, ByteBuffer container) {
        return new spng_alloc(address, container);
    }

    public spng_alloc(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("spng_malloc_fn *")
    public PointerBuffer malloc_fn(int capacity) {
        return nmalloc_fn(address(), capacity);
    }

    @NativeType("spng_realloc_fn *")
    public PointerBuffer realloc_fn(int capacity) {
        return nrealloc_fn(address(), capacity);
    }

    @NativeType("spng_calloc_fn *")
    public PointerBuffer calloc_fn(int capacity) {
        return ncalloc_fn(address(), capacity);
    }

    @NativeType("spng_free_fn *")
    public PointerBuffer free_fn(int capacity) {
        return nfree_fn(address(), capacity);
    }

    public spng_alloc malloc_fn(@NativeType("spng_malloc_fn *") PointerBuffer value) {
        nmalloc_fn(address(), value);
        return this;
    }

    public spng_alloc realloc_fn(@NativeType("spng_realloc_fn *") PointerBuffer value) {
        nrealloc_fn(address(), value);
        return this;
    }

    public spng_alloc calloc_fn(@NativeType("spng_calloc_fn *") PointerBuffer value) {
        ncalloc_fn(address(), value);
        return this;
    }

    public spng_alloc free_fn(@NativeType("spng_free_fn *") PointerBuffer value) {
        nfree_fn(address(), value);
        return this;
    }

    public spng_alloc set(PointerBuffer malloc_fn, PointerBuffer realloc_fn, PointerBuffer calloc_fn, PointerBuffer free_fn) {
        malloc_fn(malloc_fn);
        realloc_fn(realloc_fn);
        calloc_fn(calloc_fn);
        free_fn(free_fn);
        return this;
    }

    public spng_alloc set(spng_alloc src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static spng_alloc malloc() {
        return new spng_alloc(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static spng_alloc calloc() {
        return new spng_alloc(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static spng_alloc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_alloc(MemoryUtil.memAddress(container), container);
    }

    public static spng_alloc create(long address) {
        return new spng_alloc(address, null);
    }

    public static spng_alloc createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new spng_alloc(address, null);
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

    public static spng_alloc malloc(MemoryStack stack) {
        return new spng_alloc(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static spng_alloc calloc(MemoryStack stack) {
        return new spng_alloc(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static PointerBuffer nmalloc_fn(long struct, int capacity) {
        return MemoryUtil.memPointerBuffer(MemoryUtil.memGetAddress(struct + MALLOC_FN), capacity);
    }

    public static PointerBuffer nrealloc_fn(long struct, int capacity) {
        return MemoryUtil.memPointerBuffer(MemoryUtil.memGetAddress(struct + REALLOC_FN), capacity);
    }

    public static PointerBuffer ncalloc_fn(long struct, int capacity) {
        return MemoryUtil.memPointerBuffer(MemoryUtil.memGetAddress(struct + CALLOC_FN), capacity);
    }

    public static PointerBuffer nfree_fn(long struct, int capacity) {
        return MemoryUtil.memPointerBuffer(MemoryUtil.memGetAddress(struct + FREE_FN), capacity);
    }

    public static void nmalloc_fn(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + MALLOC_FN, MemoryUtil.memAddress(value));
    }

    public static void nrealloc_fn(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + REALLOC_FN, MemoryUtil.memAddress(value));
    }

    public static void ncalloc_fn(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + CALLOC_FN, MemoryUtil.memAddress(value));
    }

    public static void nfree_fn(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + FREE_FN, MemoryUtil.memAddress(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + MALLOC_FN));
        Checks.check(MemoryUtil.memGetAddress(struct + REALLOC_FN));
        Checks.check(MemoryUtil.memGetAddress(struct + CALLOC_FN));
        Checks.check(MemoryUtil.memGetAddress(struct + FREE_FN));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_alloc$Buffer.class */
    public static class Buffer extends StructBuffer<spng_alloc, Buffer> implements NativeResource {
        private static final spng_alloc ELEMENT_FACTORY = spng_alloc.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / spng_alloc.SIZEOF);
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
        public spng_alloc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("spng_malloc_fn *")
        public PointerBuffer malloc_fn(int capacity) {
            return spng_alloc.nmalloc_fn(address(), capacity);
        }

        @NativeType("spng_realloc_fn *")
        public PointerBuffer realloc_fn(int capacity) {
            return spng_alloc.nrealloc_fn(address(), capacity);
        }

        @NativeType("spng_calloc_fn *")
        public PointerBuffer calloc_fn(int capacity) {
            return spng_alloc.ncalloc_fn(address(), capacity);
        }

        @NativeType("spng_free_fn *")
        public PointerBuffer free_fn(int capacity) {
            return spng_alloc.nfree_fn(address(), capacity);
        }

        public Buffer malloc_fn(@NativeType("spng_malloc_fn *") PointerBuffer value) {
            spng_alloc.nmalloc_fn(address(), value);
            return this;
        }

        public Buffer realloc_fn(@NativeType("spng_realloc_fn *") PointerBuffer value) {
            spng_alloc.nrealloc_fn(address(), value);
            return this;
        }

        public Buffer calloc_fn(@NativeType("spng_calloc_fn *") PointerBuffer value) {
            spng_alloc.ncalloc_fn(address(), value);
            return this;
        }

        public Buffer free_fn(@NativeType("spng_free_fn *") PointerBuffer value) {
            spng_alloc.nfree_fn(address(), value);
            return this;
        }
    }
}
