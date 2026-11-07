package org.lwjgl.stb;

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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBIIOCallbacks.class
 */
@NativeType("struct stbi_io_callbacks")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBIIOCallbacks.class */
public class STBIIOCallbacks extends Struct<STBIIOCallbacks> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int READ;
    public static final int SKIP;
    public static final int EOF;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        READ = layout.offsetof(0);
        SKIP = layout.offsetof(1);
        EOF = layout.offsetof(2);
    }

    protected STBIIOCallbacks(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public STBIIOCallbacks create(long address, ByteBuffer container) {
        return new STBIIOCallbacks(address, container);
    }

    public STBIIOCallbacks(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("int (*) (void *, char *, int)")
    public STBIReadCallback read() {
        return nread(address());
    }

    @NativeType("void (*) (void *, int)")
    public STBISkipCallback skip() {
        return nskip(address());
    }

    @NativeType("int (*) (void *)")
    public STBIEOFCallback eof() {
        return neof(address());
    }

    public STBIIOCallbacks read(@NativeType("int (*) (void *, char *, int)") STBIReadCallbackI value) {
        nread(address(), value);
        return this;
    }

    public STBIIOCallbacks skip(@NativeType("void (*) (void *, int)") STBISkipCallbackI value) {
        nskip(address(), value);
        return this;
    }

    public STBIIOCallbacks eof(@NativeType("int (*) (void *)") STBIEOFCallbackI value) {
        neof(address(), value);
        return this;
    }

    public STBIIOCallbacks set(STBIReadCallbackI read, STBISkipCallbackI skip, STBIEOFCallbackI eof) {
        read(read);
        skip(skip);
        eof(eof);
        return this;
    }

    public STBIIOCallbacks set(STBIIOCallbacks src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static STBIIOCallbacks malloc() {
        return new STBIIOCallbacks(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static STBIIOCallbacks calloc() {
        return new STBIIOCallbacks(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static STBIIOCallbacks create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new STBIIOCallbacks(MemoryUtil.memAddress(container), container);
    }

    public static STBIIOCallbacks create(long address) {
        return new STBIIOCallbacks(address, null);
    }

    public static STBIIOCallbacks createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new STBIIOCallbacks(address, null);
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

    public static STBIIOCallbacks malloc(MemoryStack stack) {
        return new STBIIOCallbacks(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static STBIIOCallbacks calloc(MemoryStack stack) {
        return new STBIIOCallbacks(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static STBIReadCallback nread(long struct) {
        return STBIReadCallback.create(MemoryUtil.memGetAddress(struct + READ));
    }

    public static STBISkipCallback nskip(long struct) {
        return STBISkipCallback.create(MemoryUtil.memGetAddress(struct + SKIP));
    }

    public static STBIEOFCallback neof(long struct) {
        return STBIEOFCallback.create(MemoryUtil.memGetAddress(struct + EOF));
    }

    public static void nread(long struct, STBIReadCallbackI value) {
        MemoryUtil.memPutAddress(struct + READ, value.address());
    }

    public static void nskip(long struct, STBISkipCallbackI value) {
        MemoryUtil.memPutAddress(struct + SKIP, value.address());
    }

    public static void neof(long struct, STBIEOFCallbackI value) {
        MemoryUtil.memPutAddress(struct + EOF, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + READ));
        Checks.check(MemoryUtil.memGetAddress(struct + SKIP));
        Checks.check(MemoryUtil.memGetAddress(struct + EOF));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBIIOCallbacks$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBIIOCallbacks$Buffer.class */
    public static class Buffer extends StructBuffer<STBIIOCallbacks, Buffer> implements NativeResource {
        private static final STBIIOCallbacks ELEMENT_FACTORY = STBIIOCallbacks.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / STBIIOCallbacks.SIZEOF);
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
        public STBIIOCallbacks getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("int (*) (void *, char *, int)")
        public STBIReadCallback read() {
            return STBIIOCallbacks.nread(address());
        }

        @NativeType("void (*) (void *, int)")
        public STBISkipCallback skip() {
            return STBIIOCallbacks.nskip(address());
        }

        @NativeType("int (*) (void *)")
        public STBIEOFCallback eof() {
            return STBIIOCallbacks.neof(address());
        }

        public Buffer read(@NativeType("int (*) (void *, char *, int)") STBIReadCallbackI value) {
            STBIIOCallbacks.nread(address(), value);
            return this;
        }

        public Buffer skip(@NativeType("void (*) (void *, int)") STBISkipCallbackI value) {
            STBIIOCallbacks.nskip(address(), value);
            return this;
        }

        public Buffer eof(@NativeType("int (*) (void *)") STBIEOFCallbackI value) {
            STBIIOCallbacks.neof(address(), value);
            return this;
        }
    }
}
