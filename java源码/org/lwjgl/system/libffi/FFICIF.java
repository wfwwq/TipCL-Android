package org.lwjgl.system.libffi;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/libffi/FFICIF.class
 */
@NativeType("struct ffi_cif")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/libffi/FFICIF.class */
public class FFICIF extends Struct<FFICIF> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ABI;
    public static final int NARGS;
    public static final int ARG_TYPES;
    public static final int RTYPE;
    public static final int BYTES;
    public static final int FLAGS;

    private static native int offsets(long j);

    static {
        MemoryStack stack = MemoryStack.stackPush();
        try {
            IntBuffer offsets = stack.mallocInt(7);
            SIZEOF = offsets(MemoryUtil.memAddress(offsets));
            ABI = offsets.get(0);
            NARGS = offsets.get(1);
            ARG_TYPES = offsets.get(2);
            RTYPE = offsets.get(3);
            BYTES = offsets.get(4);
            FLAGS = offsets.get(5);
            ALIGNOF = offsets.get(6);
            if (stack != null) {
                stack.close();
            }
        } catch (Throwable th) {
            if (stack != null) {
                try {
                    stack.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    protected FFICIF(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FFICIF create(long address, ByteBuffer container) {
        return new FFICIF(address, container);
    }

    public FFICIF(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("ffi_abi")
    public int abi() {
        return nabi(address());
    }

    @NativeType("unsigned")
    public int nargs() {
        return nnargs(address());
    }

    @NativeType("ffi_type **")
    public PointerBuffer arg_types() {
        return narg_types(address());
    }

    @NativeType("ffi_type *")
    public FFIType rtype() {
        return nrtype(address());
    }

    @NativeType("unsigned")
    public int bytes() {
        return nbytes(address());
    }

    @NativeType("unsigned")
    public int flags() {
        return nflags(address());
    }

    public static FFICIF malloc() {
        return new FFICIF(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FFICIF calloc() {
        return new FFICIF(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FFICIF create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FFICIF(MemoryUtil.memAddress(container), container);
    }

    public static FFICIF create(long address) {
        return new FFICIF(address, null);
    }

    public static FFICIF createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FFICIF(address, null);
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

    public static FFICIF malloc(MemoryStack stack) {
        return new FFICIF(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FFICIF calloc(MemoryStack stack) {
        return new FFICIF(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nabi(long struct) {
        return MemoryUtil.memGetInt(struct + ABI);
    }

    public static int nnargs(long struct) {
        return MemoryUtil.memGetInt(struct + NARGS);
    }

    public static PointerBuffer narg_types(long struct) {
        return MemoryUtil.memPointerBuffer(MemoryUtil.memGetAddress(struct + ARG_TYPES), nnargs(struct));
    }

    public static FFIType nrtype(long struct) {
        return FFIType.create(MemoryUtil.memGetAddress(struct + RTYPE));
    }

    public static int nbytes(long struct) {
        return MemoryUtil.memGetInt(struct + BYTES);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/libffi/FFICIF$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/libffi/FFICIF$Buffer.class */
    public static class Buffer extends StructBuffer<FFICIF, Buffer> implements NativeResource {
        private static final FFICIF ELEMENT_FACTORY = FFICIF.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FFICIF.SIZEOF);
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
        public FFICIF getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("ffi_abi")
        public int abi() {
            return FFICIF.nabi(address());
        }

        @NativeType("unsigned")
        public int nargs() {
            return FFICIF.nnargs(address());
        }

        @NativeType("ffi_type **")
        public PointerBuffer arg_types() {
            return FFICIF.narg_types(address());
        }

        @NativeType("ffi_type *")
        public FFIType rtype() {
            return FFICIF.nrtype(address());
        }

        @NativeType("unsigned")
        public int bytes() {
            return FFICIF.nbytes(address());
        }

        @NativeType("unsigned")
        public int flags() {
            return FFICIF.nflags(address());
        }
    }
}
