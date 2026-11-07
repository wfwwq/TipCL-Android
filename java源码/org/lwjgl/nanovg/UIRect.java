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

@NativeType("struct UIrect")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/UIRect.class */
public class UIRect extends Struct<UIRect> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int V;
    public static final int X;
    public static final int Y;
    public static final int W;
    public static final int H;

    static {
        Struct.Layout layout = __struct(__union(__array(4, 4), __struct(__member(4), __member(4), __member(4), __member(4))));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        V = layout.offsetof(1);
        X = layout.offsetof(3);
        Y = layout.offsetof(4);
        W = layout.offsetof(5);
        H = layout.offsetof(6);
    }

    protected UIRect(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public UIRect create(long address, @Nullable ByteBuffer container) {
        return new UIRect(address, container);
    }

    public UIRect(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("int[4]")
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

    public int w() {
        return nw(address());
    }

    public int h() {
        return nh(address());
    }

    public UIRect v(@NativeType("int[4]") IntBuffer value) {
        nv(address(), value);
        return this;
    }

    public UIRect v(int index, int value) {
        nv(address(), index, value);
        return this;
    }

    public UIRect x(int value) {
        nx(address(), value);
        return this;
    }

    public UIRect y(int value) {
        ny(address(), value);
        return this;
    }

    public UIRect w(int value) {
        nw(address(), value);
        return this;
    }

    public UIRect h(int value) {
        nh(address(), value);
        return this;
    }

    public UIRect set(UIRect src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static UIRect malloc() {
        return new UIRect(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static UIRect calloc() {
        return new UIRect(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static UIRect create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new UIRect(MemoryUtil.memAddress(container), container);
    }

    public static UIRect create(long address) {
        return new UIRect(address, null);
    }

    @Nullable
    public static UIRect createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new UIRect(address, null);
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
    public static UIRect mallocStack() {
        return malloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static UIRect callocStack() {
        return calloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static UIRect mallocStack(MemoryStack stack) {
        return malloc(stack);
    }

    @Deprecated
    public static UIRect callocStack(MemoryStack stack) {
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

    public static UIRect malloc(MemoryStack stack) {
        return new UIRect(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static UIRect calloc(MemoryStack stack) {
        return new UIRect(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static IntBuffer nv(long struct) {
        return MemoryUtil.memIntBuffer(struct + V, 4);
    }

    public static int nv(long struct, int index) {
        return UNSAFE.getInt((Object) null, struct + V + (Checks.check(index, 4) * 4));
    }

    public static int nx(long struct) {
        return UNSAFE.getInt((Object) null, struct + X);
    }

    public static int ny(long struct) {
        return UNSAFE.getInt((Object) null, struct + Y);
    }

    public static int nw(long struct) {
        return UNSAFE.getInt((Object) null, struct + W);
    }

    public static int nh(long struct) {
        return UNSAFE.getInt((Object) null, struct + H);
    }

    public static void nv(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 4);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + V, value.remaining() * 4);
    }

    public static void nv(long struct, int index, int value) {
        UNSAFE.putInt((Object) null, struct + V + (Checks.check(index, 4) * 4), value);
    }

    public static void nx(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + X, value);
    }

    public static void ny(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + Y, value);
    }

    public static void nw(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + W, value);
    }

    public static void nh(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + H, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/UIRect$Buffer.class */
    public static class Buffer extends StructBuffer<UIRect, Buffer> implements NativeResource {
        private static final UIRect ELEMENT_FACTORY = UIRect.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / UIRect.SIZEOF);
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
        public UIRect getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("int[4]")
        public IntBuffer v() {
            return UIRect.nv(address());
        }

        public int v(int index) {
            return UIRect.nv(address(), index);
        }

        public int x() {
            return UIRect.nx(address());
        }

        public int y() {
            return UIRect.ny(address());
        }

        public int w() {
            return UIRect.nw(address());
        }

        public int h() {
            return UIRect.nh(address());
        }

        public Buffer v(@NativeType("int[4]") IntBuffer value) {
            UIRect.nv(address(), value);
            return this;
        }

        public Buffer v(int index, int value) {
            UIRect.nv(address(), index, value);
            return this;
        }

        public Buffer x(int value) {
            UIRect.nx(address(), value);
            return this;
        }

        public Buffer y(int value) {
            UIRect.ny(address(), value);
            return this;
        }

        public Buffer w(int value) {
            UIRect.nw(address(), value);
            return this;
        }

        public Buffer h(int value) {
            UIRect.nh(address(), value);
            return this;
        }
    }
}
