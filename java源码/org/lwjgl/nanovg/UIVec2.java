package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import javax.annotation.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct UIvec2")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/UIVec2.class */
public class UIVec2 extends Struct<UIVec2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int V;
    public static final int X;
    public static final int Y;

    static {
        Struct.Layout layout = __struct(__union(__array(4, 2), __struct(__member(4), __member(4))));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        V = layout.offsetof(1);
        X = layout.offsetof(3);
        Y = layout.offsetof(4);
    }

    protected UIVec2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public UIVec2 create(long address, @Nullable ByteBuffer container) {
        return new UIVec2(address, container);
    }

    public UIVec2(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("int[2]")
    public IntBuffer v() {
        return nv(address());
    }

    public int v(int index) {
        return nv(address(), index);
    }

    public int x() {
        return nx(address());
    }

    public int y() {
        return ny(address());
    }

    public UIVec2 v(@NativeType("int[2]") IntBuffer value) {
        nv(address(), value);
        return this;
    }

    public UIVec2 v(int index, int value) {
        nv(address(), index, value);
        return this;
    }

    public UIVec2 x(int value) {
        nx(address(), value);
        return this;
    }

    public UIVec2 y(int value) {
        ny(address(), value);
        return this;
    }

    public UIVec2 set(UIVec2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static UIVec2 malloc() {
        return new UIVec2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static UIVec2 calloc() {
        return new UIVec2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static UIVec2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new UIVec2(MemoryUtil.memAddress(container), container);
    }

    public static UIVec2 create(long address) {
        return new UIVec2(address, null);
    }

    @Nullable
    public static UIVec2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new UIVec2(address, null);
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

    @Nullable
    public static Buffer createSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return new Buffer(address, capacity);
    }

    @Deprecated
    public static UIVec2 mallocStack() {
        return malloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static UIVec2 callocStack() {
        return calloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static UIVec2 mallocStack(MemoryStack stack) {
        return malloc(stack);
    }

    @Deprecated
    public static UIVec2 callocStack(MemoryStack stack) {
        return calloc(stack);
    }

    @Deprecated
    public static Buffer mallocStack(int capacity) {
        return malloc(capacity, MemoryStack.stackGet());
    }

    @Deprecated
    public static Buffer callocStack(int capacity) {
        return calloc(capacity, MemoryStack.stackGet());
    }

    @Deprecated
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return malloc(capacity, stack);
    }

    @Deprecated
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return calloc(capacity, stack);
    }

    public static UIVec2 malloc(MemoryStack stack) {
        return new UIVec2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static UIVec2 calloc(MemoryStack stack) {
        return new UIVec2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static IntBuffer nv(long struct) {
        return MemoryUtil.memIntBuffer(struct + V, 2);
    }

    public static int nv(long struct, int index) {
        return UNSAFE.getInt((Object) null, struct + V + (Checks.check(index, 2) * 4));
    }

    public static int nx(long struct) {
        return UNSAFE.getInt((Object) null, struct + X);
    }

    public static int ny(long struct) {
        return UNSAFE.getInt((Object) null, struct + Y);
    }

    public static void nv(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 2);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + V, value.remaining() * 4);
    }

    public static void nv(long struct, int index, int value) {
        UNSAFE.putInt((Object) null, struct + V + (Checks.check(index, 2) * 4), value);
    }

    public static void nx(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + X, value);
    }

    public static void ny(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + Y, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/UIVec2$Buffer.class */
    public static class Buffer extends StructBuffer<UIVec2, Buffer> implements NativeResource {
        private static final UIVec2 ELEMENT_FACTORY = UIVec2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / UIVec2.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public UIVec2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("int[2]")
        public IntBuffer v() {
            return UIVec2.nv(address());
        }

        public int v(int index) {
            return UIVec2.nv(address(), index);
        }

        public int x() {
            return UIVec2.nx(address());
        }

        public int y() {
            return UIVec2.ny(address());
        }

        public Buffer v(@NativeType("int[2]") IntBuffer value) {
            UIVec2.nv(address(), value);
            return this;
        }

        public Buffer v(int index, int value) {
            UIVec2.nv(address(), index, value);
            return this;
        }

        public Buffer x(int value) {
            UIVec2.nx(address(), value);
            return this;
        }

        public Buffer y(int value) {
            UIVec2.ny(address(), value);
            return this;
        }
    }
}
