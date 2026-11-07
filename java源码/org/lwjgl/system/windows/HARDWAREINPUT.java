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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/HARDWAREINPUT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/HARDWAREINPUT.class */
public class HARDWAREINPUT extends Struct<HARDWAREINPUT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int UMSG;
    public static final int WPARAML;
    public static final int WPARAMH;

    static {
        Struct.Layout layout = __struct(__member(4), __member(2), __member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        UMSG = layout.offsetof(0);
        WPARAML = layout.offsetof(1);
        WPARAMH = layout.offsetof(2);
    }

    protected HARDWAREINPUT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public HARDWAREINPUT create(long address, ByteBuffer container) {
        return new HARDWAREINPUT(address, container);
    }

    public HARDWAREINPUT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("DWORD")
    public int uMsg() {
        return nuMsg(address());
    }

    @NativeType("WORD")
    public short wParamL() {
        return nwParamL(address());
    }

    @NativeType("WORD")
    public short wParamH() {
        return nwParamH(address());
    }

    public HARDWAREINPUT uMsg(@NativeType("DWORD") int value) {
        nuMsg(address(), value);
        return this;
    }

    public HARDWAREINPUT wParamL(@NativeType("WORD") short value) {
        nwParamL(address(), value);
        return this;
    }

    public HARDWAREINPUT wParamH(@NativeType("WORD") short value) {
        nwParamH(address(), value);
        return this;
    }

    public HARDWAREINPUT set(int uMsg, short wParamL, short wParamH) {
        uMsg(uMsg);
        wParamL(wParamL);
        wParamH(wParamH);
        return this;
    }

    public HARDWAREINPUT set(HARDWAREINPUT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static HARDWAREINPUT malloc() {
        return new HARDWAREINPUT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static HARDWAREINPUT calloc() {
        return new HARDWAREINPUT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static HARDWAREINPUT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new HARDWAREINPUT(MemoryUtil.memAddress(container), container);
    }

    public static HARDWAREINPUT create(long address) {
        return new HARDWAREINPUT(address, null);
    }

    public static HARDWAREINPUT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new HARDWAREINPUT(address, null);
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

    public static HARDWAREINPUT malloc(MemoryStack stack) {
        return new HARDWAREINPUT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static HARDWAREINPUT calloc(MemoryStack stack) {
        return new HARDWAREINPUT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nuMsg(long struct) {
        return MemoryUtil.memGetInt(struct + UMSG);
    }

    public static short nwParamL(long struct) {
        return MemoryUtil.memGetShort(struct + WPARAML);
    }

    public static short nwParamH(long struct) {
        return MemoryUtil.memGetShort(struct + WPARAMH);
    }

    public static void nuMsg(long struct, int value) {
        MemoryUtil.memPutInt(struct + UMSG, value);
    }

    public static void nwParamL(long struct, short value) {
        MemoryUtil.memPutShort(struct + WPARAML, value);
    }

    public static void nwParamH(long struct, short value) {
        MemoryUtil.memPutShort(struct + WPARAMH, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/HARDWAREINPUT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/HARDWAREINPUT$Buffer.class */
    public static class Buffer extends StructBuffer<HARDWAREINPUT, Buffer> implements NativeResource {
        private static final HARDWAREINPUT ELEMENT_FACTORY = HARDWAREINPUT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / HARDWAREINPUT.SIZEOF);
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
        public HARDWAREINPUT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("DWORD")
        public int uMsg() {
            return HARDWAREINPUT.nuMsg(address());
        }

        @NativeType("WORD")
        public short wParamL() {
            return HARDWAREINPUT.nwParamL(address());
        }

        @NativeType("WORD")
        public short wParamH() {
            return HARDWAREINPUT.nwParamH(address());
        }

        public Buffer uMsg(@NativeType("DWORD") int value) {
            HARDWAREINPUT.nuMsg(address(), value);
            return this;
        }

        public Buffer wParamL(@NativeType("WORD") short value) {
            HARDWAREINPUT.nwParamL(address(), value);
            return this;
        }

        public Buffer wParamH(@NativeType("WORD") short value) {
            HARDWAREINPUT.nwParamH(address(), value);
            return this;
        }
    }
}
