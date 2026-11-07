package org.lwjgl.system.windows;

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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/SECURITY_ATTRIBUTES.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/SECURITY_ATTRIBUTES.class */
public class SECURITY_ATTRIBUTES extends Struct<SECURITY_ATTRIBUTES> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NLENGTH;
    public static final int LPSECURITYDESCRIPTOR;
    public static final int BINHERITHANDLE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NLENGTH = layout.offsetof(0);
        LPSECURITYDESCRIPTOR = layout.offsetof(1);
        BINHERITHANDLE = layout.offsetof(2);
    }

    protected SECURITY_ATTRIBUTES(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SECURITY_ATTRIBUTES create(long address, ByteBuffer container) {
        return new SECURITY_ATTRIBUTES(address, container);
    }

    public SECURITY_ATTRIBUTES(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("DWORD")
    public int nLength() {
        return nnLength(address());
    }

    @NativeType("LPVOID")
    public long lpSecurityDescriptor() {
        return nlpSecurityDescriptor(address());
    }

    @NativeType("BOOL")
    public boolean bInheritHandle() {
        return nbInheritHandle(address()) != 0;
    }

    public SECURITY_ATTRIBUTES nLength(@NativeType("DWORD") int value) {
        nnLength(address(), value);
        return this;
    }

    public SECURITY_ATTRIBUTES lpSecurityDescriptor(@NativeType("LPVOID") long value) {
        nlpSecurityDescriptor(address(), value);
        return this;
    }

    public SECURITY_ATTRIBUTES bInheritHandle(@NativeType("BOOL") boolean value) {
        nbInheritHandle(address(), value ? 1 : 0);
        return this;
    }

    public SECURITY_ATTRIBUTES set(int nLength, long lpSecurityDescriptor, boolean bInheritHandle) {
        nLength(nLength);
        lpSecurityDescriptor(lpSecurityDescriptor);
        bInheritHandle(bInheritHandle);
        return this;
    }

    public SECURITY_ATTRIBUTES set(SECURITY_ATTRIBUTES src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SECURITY_ATTRIBUTES malloc() {
        return new SECURITY_ATTRIBUTES(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SECURITY_ATTRIBUTES calloc() {
        return new SECURITY_ATTRIBUTES(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SECURITY_ATTRIBUTES create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SECURITY_ATTRIBUTES(MemoryUtil.memAddress(container), container);
    }

    public static SECURITY_ATTRIBUTES create(long address) {
        return new SECURITY_ATTRIBUTES(address, null);
    }

    public static SECURITY_ATTRIBUTES createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SECURITY_ATTRIBUTES(address, null);
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

    public static SECURITY_ATTRIBUTES malloc(MemoryStack stack) {
        return new SECURITY_ATTRIBUTES(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SECURITY_ATTRIBUTES calloc(MemoryStack stack) {
        return new SECURITY_ATTRIBUTES(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nnLength(long struct) {
        return MemoryUtil.memGetInt(struct + NLENGTH);
    }

    public static long nlpSecurityDescriptor(long struct) {
        return MemoryUtil.memGetAddress(struct + LPSECURITYDESCRIPTOR);
    }

    public static int nbInheritHandle(long struct) {
        return MemoryUtil.memGetInt(struct + BINHERITHANDLE);
    }

    public static void nnLength(long struct, int value) {
        MemoryUtil.memPutInt(struct + NLENGTH, value);
    }

    public static void nlpSecurityDescriptor(long struct, long value) {
        MemoryUtil.memPutAddress(struct + LPSECURITYDESCRIPTOR, Checks.check(value));
    }

    public static void nbInheritHandle(long struct, int value) {
        MemoryUtil.memPutInt(struct + BINHERITHANDLE, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + LPSECURITYDESCRIPTOR));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/SECURITY_ATTRIBUTES$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/SECURITY_ATTRIBUTES$Buffer.class */
    public static class Buffer extends StructBuffer<SECURITY_ATTRIBUTES, Buffer> implements NativeResource {
        private static final SECURITY_ATTRIBUTES ELEMENT_FACTORY = SECURITY_ATTRIBUTES.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SECURITY_ATTRIBUTES.SIZEOF);
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
        public SECURITY_ATTRIBUTES getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("DWORD")
        public int nLength() {
            return SECURITY_ATTRIBUTES.nnLength(address());
        }

        @NativeType("LPVOID")
        public long lpSecurityDescriptor() {
            return SECURITY_ATTRIBUTES.nlpSecurityDescriptor(address());
        }

        @NativeType("BOOL")
        public boolean bInheritHandle() {
            return SECURITY_ATTRIBUTES.nbInheritHandle(address()) != 0;
        }

        public Buffer nLength(@NativeType("DWORD") int value) {
            SECURITY_ATTRIBUTES.nnLength(address(), value);
            return this;
        }

        public Buffer lpSecurityDescriptor(@NativeType("LPVOID") long value) {
            SECURITY_ATTRIBUTES.nlpSecurityDescriptor(address(), value);
            return this;
        }

        public Buffer bInheritHandle(@NativeType("BOOL") boolean value) {
            SECURITY_ATTRIBUTES.nbInheritHandle(address(), value ? 1 : 0);
            return this;
        }
    }
}
