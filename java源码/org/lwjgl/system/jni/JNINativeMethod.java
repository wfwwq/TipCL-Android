package org.lwjgl.system.jni;

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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/jni/JNINativeMethod.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/jni/JNINativeMethod.class */
public class JNINativeMethod extends Struct<JNINativeMethod> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NAME;
    public static final int SIGNATURE;
    public static final int FNPTR;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NAME = layout.offsetof(0);
        SIGNATURE = layout.offsetof(1);
        FNPTR = layout.offsetof(2);
    }

    protected JNINativeMethod(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public JNINativeMethod create(long address, ByteBuffer container) {
        return new JNINativeMethod(address, container);
    }

    public JNINativeMethod(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("char *")
    public ByteBuffer name() {
        return nname(address());
    }

    @NativeType("char *")
    public String nameString() {
        return nnameString(address());
    }

    @NativeType("char *")
    public ByteBuffer signature() {
        return nsignature(address());
    }

    @NativeType("char *")
    public String signatureString() {
        return nsignatureString(address());
    }

    @NativeType("void *")
    public long fnPtr() {
        return nfnPtr(address());
    }

    public JNINativeMethod name(@NativeType("char *") ByteBuffer value) {
        nname(address(), value);
        return this;
    }

    public JNINativeMethod signature(@NativeType("char *") ByteBuffer value) {
        nsignature(address(), value);
        return this;
    }

    public JNINativeMethod fnPtr(@NativeType("void *") long value) {
        nfnPtr(address(), value);
        return this;
    }

    public JNINativeMethod set(ByteBuffer name, ByteBuffer signature, long fnPtr) {
        name(name);
        signature(signature);
        fnPtr(fnPtr);
        return this;
    }

    public JNINativeMethod set(JNINativeMethod src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static JNINativeMethod malloc() {
        return new JNINativeMethod(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static JNINativeMethod calloc() {
        return new JNINativeMethod(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static JNINativeMethod create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new JNINativeMethod(MemoryUtil.memAddress(container), container);
    }

    public static JNINativeMethod create(long address) {
        return new JNINativeMethod(address, null);
    }

    public static JNINativeMethod createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new JNINativeMethod(address, null);
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

    public static JNINativeMethod malloc(MemoryStack stack) {
        return new JNINativeMethod(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static JNINativeMethod calloc(MemoryStack stack) {
        return new JNINativeMethod(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer nname(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + NAME));
    }

    public static String nnameString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + NAME));
    }

    public static ByteBuffer nsignature(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + SIGNATURE));
    }

    public static String nsignatureString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + SIGNATURE));
    }

    public static long nfnPtr(long struct) {
        return MemoryUtil.memGetAddress(struct + FNPTR);
    }

    public static void nname(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + NAME, MemoryUtil.memAddress(value));
    }

    public static void nsignature(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + SIGNATURE, MemoryUtil.memAddress(value));
    }

    public static void nfnPtr(long struct, long value) {
        MemoryUtil.memPutAddress(struct + FNPTR, Checks.check(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + NAME));
        Checks.check(MemoryUtil.memGetAddress(struct + SIGNATURE));
        Checks.check(MemoryUtil.memGetAddress(struct + FNPTR));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/jni/JNINativeMethod$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/jni/JNINativeMethod$Buffer.class */
    public static class Buffer extends StructBuffer<JNINativeMethod, Buffer> implements NativeResource {
        private static final JNINativeMethod ELEMENT_FACTORY = JNINativeMethod.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / JNINativeMethod.SIZEOF);
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
        public JNINativeMethod getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("char *")
        public ByteBuffer name() {
            return JNINativeMethod.nname(address());
        }

        @NativeType("char *")
        public String nameString() {
            return JNINativeMethod.nnameString(address());
        }

        @NativeType("char *")
        public ByteBuffer signature() {
            return JNINativeMethod.nsignature(address());
        }

        @NativeType("char *")
        public String signatureString() {
            return JNINativeMethod.nsignatureString(address());
        }

        @NativeType("void *")
        public long fnPtr() {
            return JNINativeMethod.nfnPtr(address());
        }

        public Buffer name(@NativeType("char *") ByteBuffer value) {
            JNINativeMethod.nname(address(), value);
            return this;
        }

        public Buffer signature(@NativeType("char *") ByteBuffer value) {
            JNINativeMethod.nsignature(address(), value);
            return this;
        }

        public Buffer fnPtr(@NativeType("void *") long value) {
            JNINativeMethod.nfnPtr(address(), value);
            return this;
        }
    }
}
