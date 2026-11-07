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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/WINDOWPLACEMENT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/WINDOWPLACEMENT.class */
public class WINDOWPLACEMENT extends Struct<WINDOWPLACEMENT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int LENGTH;
    public static final int FLAGS;
    public static final int SHOWCMD;
    public static final int PTMINPOSITION;
    public static final int PTMAXPOSITION;
    public static final int RCNORMALPOSITION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(POINT.SIZEOF, POINT.ALIGNOF), __member(POINT.SIZEOF, POINT.ALIGNOF), __member(RECT.SIZEOF, RECT.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        LENGTH = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        SHOWCMD = layout.offsetof(2);
        PTMINPOSITION = layout.offsetof(3);
        PTMAXPOSITION = layout.offsetof(4);
        RCNORMALPOSITION = layout.offsetof(5);
    }

    protected WINDOWPLACEMENT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public WINDOWPLACEMENT create(long address, ByteBuffer container) {
        return new WINDOWPLACEMENT(address, container);
    }

    public WINDOWPLACEMENT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("UINT")
    public int length() {
        return nlength(address());
    }

    @NativeType("UINT")
    public int flags() {
        return nflags(address());
    }

    @NativeType("UINT")
    public int showCmd() {
        return nshowCmd(address());
    }

    public POINT ptMinPosition() {
        return nptMinPosition(address());
    }

    public POINT ptMaxPosition() {
        return nptMaxPosition(address());
    }

    public RECT rcNormalPosition() {
        return nrcNormalPosition(address());
    }

    public WINDOWPLACEMENT length(@NativeType("UINT") int value) {
        nlength(address(), value);
        return this;
    }

    public WINDOWPLACEMENT flags(@NativeType("UINT") int value) {
        nflags(address(), value);
        return this;
    }

    public WINDOWPLACEMENT showCmd(@NativeType("UINT") int value) {
        nshowCmd(address(), value);
        return this;
    }

    public WINDOWPLACEMENT ptMinPosition(POINT value) {
        nptMinPosition(address(), value);
        return this;
    }

    public WINDOWPLACEMENT ptMinPosition(Consumer<POINT> consumer) {
        consumer.accept(ptMinPosition());
        return this;
    }

    public WINDOWPLACEMENT ptMaxPosition(POINT value) {
        nptMaxPosition(address(), value);
        return this;
    }

    public WINDOWPLACEMENT ptMaxPosition(Consumer<POINT> consumer) {
        consumer.accept(ptMaxPosition());
        return this;
    }

    public WINDOWPLACEMENT rcNormalPosition(RECT value) {
        nrcNormalPosition(address(), value);
        return this;
    }

    public WINDOWPLACEMENT rcNormalPosition(Consumer<RECT> consumer) {
        consumer.accept(rcNormalPosition());
        return this;
    }

    public WINDOWPLACEMENT set(int length, int flags, int showCmd, POINT ptMinPosition, POINT ptMaxPosition, RECT rcNormalPosition) {
        length(length);
        flags(flags);
        showCmd(showCmd);
        ptMinPosition(ptMinPosition);
        ptMaxPosition(ptMaxPosition);
        rcNormalPosition(rcNormalPosition);
        return this;
    }

    public WINDOWPLACEMENT set(WINDOWPLACEMENT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static WINDOWPLACEMENT malloc() {
        return new WINDOWPLACEMENT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static WINDOWPLACEMENT calloc() {
        return new WINDOWPLACEMENT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static WINDOWPLACEMENT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new WINDOWPLACEMENT(MemoryUtil.memAddress(container), container);
    }

    public static WINDOWPLACEMENT create(long address) {
        return new WINDOWPLACEMENT(address, null);
    }

    public static WINDOWPLACEMENT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new WINDOWPLACEMENT(address, null);
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

    public static WINDOWPLACEMENT malloc(MemoryStack stack) {
        return new WINDOWPLACEMENT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static WINDOWPLACEMENT calloc(MemoryStack stack) {
        return new WINDOWPLACEMENT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nlength(long struct) {
        return MemoryUtil.memGetInt(struct + LENGTH);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int nshowCmd(long struct) {
        return MemoryUtil.memGetInt(struct + SHOWCMD);
    }

    public static POINT nptMinPosition(long struct) {
        return POINT.create(struct + PTMINPOSITION);
    }

    public static POINT nptMaxPosition(long struct) {
        return POINT.create(struct + PTMAXPOSITION);
    }

    public static RECT nrcNormalPosition(long struct) {
        return RECT.create(struct + RCNORMALPOSITION);
    }

    public static void nlength(long struct, int value) {
        MemoryUtil.memPutInt(struct + LENGTH, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nshowCmd(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHOWCMD, value);
    }

    public static void nptMinPosition(long struct, POINT value) {
        MemoryUtil.memCopy(value.address(), struct + PTMINPOSITION, POINT.SIZEOF);
    }

    public static void nptMaxPosition(long struct, POINT value) {
        MemoryUtil.memCopy(value.address(), struct + PTMAXPOSITION, POINT.SIZEOF);
    }

    public static void nrcNormalPosition(long struct, RECT value) {
        MemoryUtil.memCopy(value.address(), struct + RCNORMALPOSITION, RECT.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/WINDOWPLACEMENT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/WINDOWPLACEMENT$Buffer.class */
    public static class Buffer extends StructBuffer<WINDOWPLACEMENT, Buffer> implements NativeResource {
        private static final WINDOWPLACEMENT ELEMENT_FACTORY = WINDOWPLACEMENT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / WINDOWPLACEMENT.SIZEOF);
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
        public WINDOWPLACEMENT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("UINT")
        public int length() {
            return WINDOWPLACEMENT.nlength(address());
        }

        @NativeType("UINT")
        public int flags() {
            return WINDOWPLACEMENT.nflags(address());
        }

        @NativeType("UINT")
        public int showCmd() {
            return WINDOWPLACEMENT.nshowCmd(address());
        }

        public POINT ptMinPosition() {
            return WINDOWPLACEMENT.nptMinPosition(address());
        }

        public POINT ptMaxPosition() {
            return WINDOWPLACEMENT.nptMaxPosition(address());
        }

        public RECT rcNormalPosition() {
            return WINDOWPLACEMENT.nrcNormalPosition(address());
        }

        public Buffer length(@NativeType("UINT") int value) {
            WINDOWPLACEMENT.nlength(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("UINT") int value) {
            WINDOWPLACEMENT.nflags(address(), value);
            return this;
        }

        public Buffer showCmd(@NativeType("UINT") int value) {
            WINDOWPLACEMENT.nshowCmd(address(), value);
            return this;
        }

        public Buffer ptMinPosition(POINT value) {
            WINDOWPLACEMENT.nptMinPosition(address(), value);
            return this;
        }

        public Buffer ptMinPosition(Consumer<POINT> consumer) {
            consumer.accept(ptMinPosition());
            return this;
        }

        public Buffer ptMaxPosition(POINT value) {
            WINDOWPLACEMENT.nptMaxPosition(address(), value);
            return this;
        }

        public Buffer ptMaxPosition(Consumer<POINT> consumer) {
            consumer.accept(ptMaxPosition());
            return this;
        }

        public Buffer rcNormalPosition(RECT value) {
            WINDOWPLACEMENT.nrcNormalPosition(address(), value);
            return this;
        }

        public Buffer rcNormalPosition(Consumer<RECT> consumer) {
            consumer.accept(rcNormalPosition());
            return this;
        }
    }
}
