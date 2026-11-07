package org.lwjgl.system.windows;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/INPUT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/INPUT.class */
public class INPUT extends Struct<INPUT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int DUMMYUNIONNAME;
    public static final int DUMMYUNIONNAME_MI;
    public static final int DUMMYUNIONNAME_KI;
    public static final int DUMMYUNIONNAME_HI;

    static {
        Struct.Layout layout = __struct(__member(4), __union(__member(MOUSEINPUT.SIZEOF, MOUSEINPUT.ALIGNOF), __member(KEYBDINPUT.SIZEOF, KEYBDINPUT.ALIGNOF), __member(HARDWAREINPUT.SIZEOF, HARDWAREINPUT.ALIGNOF)));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        DUMMYUNIONNAME = layout.offsetof(1);
        DUMMYUNIONNAME_MI = layout.offsetof(2);
        DUMMYUNIONNAME_KI = layout.offsetof(3);
        DUMMYUNIONNAME_HI = layout.offsetof(4);
    }

    protected INPUT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public INPUT create(long address, ByteBuffer container) {
        return new INPUT(address, container);
    }

    public INPUT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("DWORD")
    public int type() {
        return ntype(address());
    }

    public MOUSEINPUT DUMMYUNIONNAME_mi() {
        return nDUMMYUNIONNAME_mi(address());
    }

    public KEYBDINPUT DUMMYUNIONNAME_ki() {
        return nDUMMYUNIONNAME_ki(address());
    }

    public HARDWAREINPUT DUMMYUNIONNAME_hi() {
        return nDUMMYUNIONNAME_hi(address());
    }

    public INPUT type(@NativeType("DWORD") int value) {
        ntype(address(), value);
        return this;
    }

    public INPUT DUMMYUNIONNAME_mi(MOUSEINPUT value) {
        nDUMMYUNIONNAME_mi(address(), value);
        return this;
    }

    public INPUT DUMMYUNIONNAME_mi(Consumer<MOUSEINPUT> consumer) {
        consumer.accept(DUMMYUNIONNAME_mi());
        return this;
    }

    public INPUT DUMMYUNIONNAME_ki(KEYBDINPUT value) {
        nDUMMYUNIONNAME_ki(address(), value);
        return this;
    }

    public INPUT DUMMYUNIONNAME_ki(Consumer<KEYBDINPUT> consumer) {
        consumer.accept(DUMMYUNIONNAME_ki());
        return this;
    }

    public INPUT DUMMYUNIONNAME_hi(HARDWAREINPUT value) {
        nDUMMYUNIONNAME_hi(address(), value);
        return this;
    }

    public INPUT DUMMYUNIONNAME_hi(Consumer<HARDWAREINPUT> consumer) {
        consumer.accept(DUMMYUNIONNAME_hi());
        return this;
    }

    public INPUT set(INPUT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static INPUT malloc() {
        return new INPUT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static INPUT calloc() {
        return new INPUT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static INPUT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new INPUT(MemoryUtil.memAddress(container), container);
    }

    public static INPUT create(long address) {
        return new INPUT(address, null);
    }

    public static INPUT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new INPUT(address, null);
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

    public static INPUT malloc(MemoryStack stack) {
        return new INPUT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static INPUT calloc(MemoryStack stack) {
        return new INPUT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static MOUSEINPUT nDUMMYUNIONNAME_mi(long struct) {
        return MOUSEINPUT.create(struct + DUMMYUNIONNAME_MI);
    }

    public static KEYBDINPUT nDUMMYUNIONNAME_ki(long struct) {
        return KEYBDINPUT.create(struct + DUMMYUNIONNAME_KI);
    }

    public static HARDWAREINPUT nDUMMYUNIONNAME_hi(long struct) {
        return HARDWAREINPUT.create(struct + DUMMYUNIONNAME_HI);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void nDUMMYUNIONNAME_mi(long struct, MOUSEINPUT value) {
        MemoryUtil.memCopy(value.address(), struct + DUMMYUNIONNAME_MI, MOUSEINPUT.SIZEOF);
    }

    public static void nDUMMYUNIONNAME_ki(long struct, KEYBDINPUT value) {
        MemoryUtil.memCopy(value.address(), struct + DUMMYUNIONNAME_KI, KEYBDINPUT.SIZEOF);
    }

    public static void nDUMMYUNIONNAME_hi(long struct, HARDWAREINPUT value) {
        MemoryUtil.memCopy(value.address(), struct + DUMMYUNIONNAME_HI, HARDWAREINPUT.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/INPUT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/INPUT$Buffer.class */
    public static class Buffer extends StructBuffer<INPUT, Buffer> implements NativeResource {
        private static final INPUT ELEMENT_FACTORY = INPUT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / INPUT.SIZEOF);
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
        public INPUT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("DWORD")
        public int type() {
            return INPUT.ntype(address());
        }

        public MOUSEINPUT DUMMYUNIONNAME_mi() {
            return INPUT.nDUMMYUNIONNAME_mi(address());
        }

        public KEYBDINPUT DUMMYUNIONNAME_ki() {
            return INPUT.nDUMMYUNIONNAME_ki(address());
        }

        public HARDWAREINPUT DUMMYUNIONNAME_hi() {
            return INPUT.nDUMMYUNIONNAME_hi(address());
        }

        public Buffer type(@NativeType("DWORD") int value) {
            INPUT.ntype(address(), value);
            return this;
        }

        public Buffer DUMMYUNIONNAME_mi(MOUSEINPUT value) {
            INPUT.nDUMMYUNIONNAME_mi(address(), value);
            return this;
        }

        public Buffer DUMMYUNIONNAME_mi(Consumer<MOUSEINPUT> consumer) {
            consumer.accept(DUMMYUNIONNAME_mi());
            return this;
        }

        public Buffer DUMMYUNIONNAME_ki(KEYBDINPUT value) {
            INPUT.nDUMMYUNIONNAME_ki(address(), value);
            return this;
        }

        public Buffer DUMMYUNIONNAME_ki(Consumer<KEYBDINPUT> consumer) {
            consumer.accept(DUMMYUNIONNAME_ki());
            return this;
        }

        public Buffer DUMMYUNIONNAME_hi(HARDWAREINPUT value) {
            INPUT.nDUMMYUNIONNAME_hi(address(), value);
            return this;
        }

        public Buffer DUMMYUNIONNAME_hi(Consumer<HARDWAREINPUT> consumer) {
            consumer.accept(DUMMYUNIONNAME_hi());
            return this;
        }
    }
}
