package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/BNDnodeTheme.class */
public class BNDnodeTheme extends Struct<BNDnodeTheme> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NODESELECTEDCOLOR;
    public static final int WIRESCOLOR;
    public static final int TEXTSELECTEDCOLOR;
    public static final int ACTIVENODECOLOR;
    public static final int WIRESELECTCOLOR;
    public static final int NODEBACKDROPCOLOR;
    public static final int NOODLECURVING;

    static {
        Struct.Layout layout = __struct(__member(NVGColor.SIZEOF, NVGColor.ALIGNOF), __member(NVGColor.SIZEOF, NVGColor.ALIGNOF), __member(NVGColor.SIZEOF, NVGColor.ALIGNOF), __member(NVGColor.SIZEOF, NVGColor.ALIGNOF), __member(NVGColor.SIZEOF, NVGColor.ALIGNOF), __member(NVGColor.SIZEOF, NVGColor.ALIGNOF), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NODESELECTEDCOLOR = layout.offsetof(0);
        WIRESCOLOR = layout.offsetof(1);
        TEXTSELECTEDCOLOR = layout.offsetof(2);
        ACTIVENODECOLOR = layout.offsetof(3);
        WIRESELECTCOLOR = layout.offsetof(4);
        NODEBACKDROPCOLOR = layout.offsetof(5);
        NOODLECURVING = layout.offsetof(6);
    }

    protected BNDnodeTheme(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public BNDnodeTheme create(long address, @Nullable ByteBuffer container) {
        return new BNDnodeTheme(address, container);
    }

    public BNDnodeTheme(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("NVGcolor")
    public NVGColor nodeSelectedColor() {
        return nnodeSelectedColor(address());
    }

    @NativeType("NVGcolor")
    public NVGColor wiresColor() {
        return nwiresColor(address());
    }

    @NativeType("NVGcolor")
    public NVGColor textSelectedColor() {
        return ntextSelectedColor(address());
    }

    @NativeType("NVGcolor")
    public NVGColor activeNodeColor() {
        return nactiveNodeColor(address());
    }

    @NativeType("NVGcolor")
    public NVGColor wireSelectColor() {
        return nwireSelectColor(address());
    }

    @NativeType("NVGcolor")
    public NVGColor nodeBackdropColor() {
        return nnodeBackdropColor(address());
    }

    public int noodleCurving() {
        return nnoodleCurving(address());
    }

    public BNDnodeTheme nodeSelectedColor(@NativeType("NVGcolor") NVGColor value) {
        nnodeSelectedColor(address(), value);
        return this;
    }

    public BNDnodeTheme nodeSelectedColor(Consumer<NVGColor> consumer) {
        consumer.accept(nodeSelectedColor());
        return this;
    }

    public BNDnodeTheme wiresColor(@NativeType("NVGcolor") NVGColor value) {
        nwiresColor(address(), value);
        return this;
    }

    public BNDnodeTheme wiresColor(Consumer<NVGColor> consumer) {
        consumer.accept(wiresColor());
        return this;
    }

    public BNDnodeTheme textSelectedColor(@NativeType("NVGcolor") NVGColor value) {
        ntextSelectedColor(address(), value);
        return this;
    }

    public BNDnodeTheme textSelectedColor(Consumer<NVGColor> consumer) {
        consumer.accept(textSelectedColor());
        return this;
    }

    public BNDnodeTheme activeNodeColor(@NativeType("NVGcolor") NVGColor value) {
        nactiveNodeColor(address(), value);
        return this;
    }

    public BNDnodeTheme activeNodeColor(Consumer<NVGColor> consumer) {
        consumer.accept(activeNodeColor());
        return this;
    }

    public BNDnodeTheme wireSelectColor(@NativeType("NVGcolor") NVGColor value) {
        nwireSelectColor(address(), value);
        return this;
    }

    public BNDnodeTheme wireSelectColor(Consumer<NVGColor> consumer) {
        consumer.accept(wireSelectColor());
        return this;
    }

    public BNDnodeTheme nodeBackdropColor(@NativeType("NVGcolor") NVGColor value) {
        nnodeBackdropColor(address(), value);
        return this;
    }

    public BNDnodeTheme nodeBackdropColor(Consumer<NVGColor> consumer) {
        consumer.accept(nodeBackdropColor());
        return this;
    }

    public BNDnodeTheme noodleCurving(int value) {
        nnoodleCurving(address(), value);
        return this;
    }

    public BNDnodeTheme set(NVGColor nodeSelectedColor, NVGColor wiresColor, NVGColor textSelectedColor, NVGColor activeNodeColor, NVGColor wireSelectColor, NVGColor nodeBackdropColor, int noodleCurving) {
        nodeSelectedColor(nodeSelectedColor);
        wiresColor(wiresColor);
        textSelectedColor(textSelectedColor);
        activeNodeColor(activeNodeColor);
        wireSelectColor(wireSelectColor);
        nodeBackdropColor(nodeBackdropColor);
        noodleCurving(noodleCurving);
        return this;
    }

    public BNDnodeTheme set(BNDnodeTheme src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static BNDnodeTheme malloc() {
        return new BNDnodeTheme(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static BNDnodeTheme calloc() {
        return new BNDnodeTheme(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static BNDnodeTheme create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new BNDnodeTheme(MemoryUtil.memAddress(container), container);
    }

    public static BNDnodeTheme create(long address) {
        return new BNDnodeTheme(address, null);
    }

    @Nullable
    public static BNDnodeTheme createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new BNDnodeTheme(address, null);
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
    public static BNDnodeTheme mallocStack() {
        return malloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static BNDnodeTheme callocStack() {
        return calloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static BNDnodeTheme mallocStack(MemoryStack stack) {
        return malloc(stack);
    }

    @Deprecated
    public static BNDnodeTheme callocStack(MemoryStack stack) {
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

    public static BNDnodeTheme malloc(MemoryStack stack) {
        return new BNDnodeTheme(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static BNDnodeTheme calloc(MemoryStack stack) {
        return new BNDnodeTheme(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static NVGColor nnodeSelectedColor(long struct) {
        return NVGColor.create(struct + NODESELECTEDCOLOR);
    }

    public static NVGColor nwiresColor(long struct) {
        return NVGColor.create(struct + WIRESCOLOR);
    }

    public static NVGColor ntextSelectedColor(long struct) {
        return NVGColor.create(struct + TEXTSELECTEDCOLOR);
    }

    public static NVGColor nactiveNodeColor(long struct) {
        return NVGColor.create(struct + ACTIVENODECOLOR);
    }

    public static NVGColor nwireSelectColor(long struct) {
        return NVGColor.create(struct + WIRESELECTCOLOR);
    }

    public static NVGColor nnodeBackdropColor(long struct) {
        return NVGColor.create(struct + NODEBACKDROPCOLOR);
    }

    public static int nnoodleCurving(long struct) {
        return UNSAFE.getInt((Object) null, struct + NOODLECURVING);
    }

    public static void nnodeSelectedColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + NODESELECTEDCOLOR, NVGColor.SIZEOF);
    }

    public static void nwiresColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + WIRESCOLOR, NVGColor.SIZEOF);
    }

    public static void ntextSelectedColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + TEXTSELECTEDCOLOR, NVGColor.SIZEOF);
    }

    public static void nactiveNodeColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + ACTIVENODECOLOR, NVGColor.SIZEOF);
    }

    public static void nwireSelectColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + WIRESELECTCOLOR, NVGColor.SIZEOF);
    }

    public static void nnodeBackdropColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + NODEBACKDROPCOLOR, NVGColor.SIZEOF);
    }

    public static void nnoodleCurving(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + NOODLECURVING, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/BNDnodeTheme$Buffer.class */
    public static class Buffer extends StructBuffer<BNDnodeTheme, Buffer> implements NativeResource {
        private static final BNDnodeTheme ELEMENT_FACTORY = BNDnodeTheme.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / BNDnodeTheme.SIZEOF);
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
        public BNDnodeTheme getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("NVGcolor")
        public NVGColor nodeSelectedColor() {
            return BNDnodeTheme.nnodeSelectedColor(address());
        }

        @NativeType("NVGcolor")
        public NVGColor wiresColor() {
            return BNDnodeTheme.nwiresColor(address());
        }

        @NativeType("NVGcolor")
        public NVGColor textSelectedColor() {
            return BNDnodeTheme.ntextSelectedColor(address());
        }

        @NativeType("NVGcolor")
        public NVGColor activeNodeColor() {
            return BNDnodeTheme.nactiveNodeColor(address());
        }

        @NativeType("NVGcolor")
        public NVGColor wireSelectColor() {
            return BNDnodeTheme.nwireSelectColor(address());
        }

        @NativeType("NVGcolor")
        public NVGColor nodeBackdropColor() {
            return BNDnodeTheme.nnodeBackdropColor(address());
        }

        public int noodleCurving() {
            return BNDnodeTheme.nnoodleCurving(address());
        }

        public Buffer nodeSelectedColor(@NativeType("NVGcolor") NVGColor value) {
            BNDnodeTheme.nnodeSelectedColor(address(), value);
            return this;
        }

        public Buffer nodeSelectedColor(Consumer<NVGColor> consumer) {
            consumer.accept(nodeSelectedColor());
            return this;
        }

        public Buffer wiresColor(@NativeType("NVGcolor") NVGColor value) {
            BNDnodeTheme.nwiresColor(address(), value);
            return this;
        }

        public Buffer wiresColor(Consumer<NVGColor> consumer) {
            consumer.accept(wiresColor());
            return this;
        }

        public Buffer textSelectedColor(@NativeType("NVGcolor") NVGColor value) {
            BNDnodeTheme.ntextSelectedColor(address(), value);
            return this;
        }

        public Buffer textSelectedColor(Consumer<NVGColor> consumer) {
            consumer.accept(textSelectedColor());
            return this;
        }

        public Buffer activeNodeColor(@NativeType("NVGcolor") NVGColor value) {
            BNDnodeTheme.nactiveNodeColor(address(), value);
            return this;
        }

        public Buffer activeNodeColor(Consumer<NVGColor> consumer) {
            consumer.accept(activeNodeColor());
            return this;
        }

        public Buffer wireSelectColor(@NativeType("NVGcolor") NVGColor value) {
            BNDnodeTheme.nwireSelectColor(address(), value);
            return this;
        }

        public Buffer wireSelectColor(Consumer<NVGColor> consumer) {
            consumer.accept(wireSelectColor());
            return this;
        }

        public Buffer nodeBackdropColor(@NativeType("NVGcolor") NVGColor value) {
            BNDnodeTheme.nnodeBackdropColor(address(), value);
            return this;
        }

        public Buffer nodeBackdropColor(Consumer<NVGColor> consumer) {
            consumer.accept(nodeBackdropColor());
            return this;
        }

        public Buffer noodleCurving(int value) {
            BNDnodeTheme.nnoodleCurving(address(), value);
            return this;
        }
    }
}
