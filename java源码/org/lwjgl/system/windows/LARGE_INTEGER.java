package org.lwjgl.system.windows;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/LARGE_INTEGER.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/LARGE_INTEGER.class */
public class LARGE_INTEGER extends Struct<LARGE_INTEGER> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int U;
    public static final int U_LOWPART;
    public static final int U_HIGHPART;
    public static final int QUADPART;

    static {
        Struct.Layout layout = __union(__struct(__member(4), __member(4)), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        U = layout.offsetof(0);
        U_LOWPART = layout.offsetof(1);
        U_HIGHPART = layout.offsetof(2);
        QUADPART = layout.offsetof(3);
    }

    protected LARGE_INTEGER(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public LARGE_INTEGER create(long address, ByteBuffer container) {
        return new LARGE_INTEGER(address, container);
    }

    public LARGE_INTEGER(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("DWORD")
    public int u_LowPart() {
        return nu_LowPart(address());
    }

    @NativeType("LONG")
    public int u_HighPart() {
        return nu_HighPart(address());
    }

    @NativeType("LONGLONG")
    public long QuadPart() {
        return nQuadPart(address());
    }

    public LARGE_INTEGER u_LowPart(@NativeType("DWORD") int value) {
        nu_LowPart(address(), value);
        return this;
    }

    public LARGE_INTEGER u_HighPart(@NativeType("LONG") int value) {
        nu_HighPart(address(), value);
        return this;
    }

    public LARGE_INTEGER QuadPart(@NativeType("LONGLONG") long value) {
        nQuadPart(address(), value);
        return this;
    }

    public LARGE_INTEGER set(LARGE_INTEGER src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static LARGE_INTEGER malloc() {
        return new LARGE_INTEGER(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static LARGE_INTEGER calloc() {
        return new LARGE_INTEGER(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static LARGE_INTEGER create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new LARGE_INTEGER(MemoryUtil.memAddress(container), container);
    }

    public static LARGE_INTEGER create(long address) {
        return new LARGE_INTEGER(address, null);
    }

    public static LARGE_INTEGER createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new LARGE_INTEGER(address, null);
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

    public static LARGE_INTEGER malloc(MemoryStack stack) {
        return new LARGE_INTEGER(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static LARGE_INTEGER calloc(MemoryStack stack) {
        return new LARGE_INTEGER(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nu_LowPart(long struct) {
        return MemoryUtil.memGetInt(struct + U_LOWPART);
    }

    public static int nu_HighPart(long struct) {
        return MemoryUtil.memGetInt(struct + U_HIGHPART);
    }

    public static long nQuadPart(long struct) {
        return MemoryUtil.memGetLong(struct + QUADPART);
    }

    public static void nu_LowPart(long struct, int value) {
        MemoryUtil.memPutInt(struct + U_LOWPART, value);
    }

    public static void nu_HighPart(long struct, int value) {
        MemoryUtil.memPutInt(struct + U_HIGHPART, value);
    }

    public static void nQuadPart(long struct, long value) {
        MemoryUtil.memPutLong(struct + QUADPART, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/LARGE_INTEGER$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/LARGE_INTEGER$Buffer.class */
    public static class Buffer extends StructBuffer<LARGE_INTEGER, Buffer> implements NativeResource {
        private static final LARGE_INTEGER ELEMENT_FACTORY = LARGE_INTEGER.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / LARGE_INTEGER.SIZEOF);
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
        public LARGE_INTEGER getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("DWORD")
        public int u_LowPart() {
            return LARGE_INTEGER.nu_LowPart(address());
        }

        @NativeType("LONG")
        public int u_HighPart() {
            return LARGE_INTEGER.nu_HighPart(address());
        }

        @NativeType("LONGLONG")
        public long QuadPart() {
            return LARGE_INTEGER.nQuadPart(address());
        }

        public Buffer u_LowPart(@NativeType("DWORD") int value) {
            LARGE_INTEGER.nu_LowPart(address(), value);
            return this;
        }

        public Buffer u_HighPart(@NativeType("LONG") int value) {
            LARGE_INTEGER.nu_HighPart(address(), value);
            return this;
        }

        public Buffer QuadPart(@NativeType("LONGLONG") long value) {
            LARGE_INTEGER.nQuadPart(address(), value);
            return this;
        }
    }
}
