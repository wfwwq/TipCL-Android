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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/BNDwidgetTheme.class */
public class BNDwidgetTheme extends Struct<BNDwidgetTheme> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int OUTLINECOLOR;
    public static final int ITEMCOLOR;
    public static final int INNERCOLOR;
    public static final int INNERSELECTEDCOLOR;
    public static final int TEXTCOLOR;
    public static final int TEXTSELECTEDCOLOR;
    public static final int SHADETOP;
    public static final int SHADEDOWN;

    static {
        Struct.Layout layout = __struct(__member(NVGColor.SIZEOF, NVGColor.ALIGNOF), __member(NVGColor.SIZEOF, NVGColor.ALIGNOF), __member(NVGColor.SIZEOF, NVGColor.ALIGNOF), __member(NVGColor.SIZEOF, NVGColor.ALIGNOF), __member(NVGColor.SIZEOF, NVGColor.ALIGNOF), __member(NVGColor.SIZEOF, NVGColor.ALIGNOF), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        OUTLINECOLOR = layout.offsetof(0);
        ITEMCOLOR = layout.offsetof(1);
        INNERCOLOR = layout.offsetof(2);
        INNERSELECTEDCOLOR = layout.offsetof(3);
        TEXTCOLOR = layout.offsetof(4);
        TEXTSELECTEDCOLOR = layout.offsetof(5);
        SHADETOP = layout.offsetof(6);
        SHADEDOWN = layout.offsetof(7);
    }

    protected BNDwidgetTheme(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public BNDwidgetTheme create(long address, @Nullable ByteBuffer container) {
        return new BNDwidgetTheme(address, container);
    }

    public BNDwidgetTheme(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("NVGcolor")
    public NVGColor outlineColor() {
        return noutlineColor(address());
    }

    @NativeType("NVGcolor")
    public NVGColor itemColor() {
        return nitemColor(address());
    }

    @NativeType("NVGcolor")
    public NVGColor innerColor() {
        return ninnerColor(address());
    }

    @NativeType("NVGcolor")
    public NVGColor innerSelectedColor() {
        return ninnerSelectedColor(address());
    }

    @NativeType("NVGcolor")
    public NVGColor textColor() {
        return ntextColor(address());
    }

    @NativeType("NVGcolor")
    public NVGColor textSelectedColor() {
        return ntextSelectedColor(address());
    }

    public int shadeTop() {
        return nshadeTop(address());
    }

    public int shadeDown() {
        return nshadeDown(address());
    }

    public BNDwidgetTheme outlineColor(@NativeType("NVGcolor") NVGColor value) {
        noutlineColor(address(), value);
        return this;
    }

    public BNDwidgetTheme outlineColor(Consumer<NVGColor> consumer) {
        consumer.accept(outlineColor());
        return this;
    }

    public BNDwidgetTheme itemColor(@NativeType("NVGcolor") NVGColor value) {
        nitemColor(address(), value);
        return this;
    }

    public BNDwidgetTheme itemColor(Consumer<NVGColor> consumer) {
        consumer.accept(itemColor());
        return this;
    }

    public BNDwidgetTheme innerColor(@NativeType("NVGcolor") NVGColor value) {
        ninnerColor(address(), value);
        return this;
    }

    public BNDwidgetTheme innerColor(Consumer<NVGColor> consumer) {
        consumer.accept(innerColor());
        return this;
    }

    public BNDwidgetTheme innerSelectedColor(@NativeType("NVGcolor") NVGColor value) {
        ninnerSelectedColor(address(), value);
        return this;
    }

    public BNDwidgetTheme innerSelectedColor(Consumer<NVGColor> consumer) {
        consumer.accept(innerSelectedColor());
        return this;
    }

    public BNDwidgetTheme textColor(@NativeType("NVGcolor") NVGColor value) {
        ntextColor(address(), value);
        return this;
    }

    public BNDwidgetTheme textColor(Consumer<NVGColor> consumer) {
        consumer.accept(textColor());
        return this;
    }

    public BNDwidgetTheme textSelectedColor(@NativeType("NVGcolor") NVGColor value) {
        ntextSelectedColor(address(), value);
        return this;
    }

    public BNDwidgetTheme textSelectedColor(Consumer<NVGColor> consumer) {
        consumer.accept(textSelectedColor());
        return this;
    }

    public BNDwidgetTheme shadeTop(int value) {
        nshadeTop(address(), value);
        return this;
    }

    public BNDwidgetTheme shadeDown(int value) {
        nshadeDown(address(), value);
        return this;
    }

    public BNDwidgetTheme set(NVGColor outlineColor, NVGColor itemColor, NVGColor innerColor, NVGColor innerSelectedColor, NVGColor textColor, NVGColor textSelectedColor, int shadeTop, int shadeDown) {
        outlineColor(outlineColor);
        itemColor(itemColor);
        innerColor(innerColor);
        innerSelectedColor(innerSelectedColor);
        textColor(textColor);
        textSelectedColor(textSelectedColor);
        shadeTop(shadeTop);
        shadeDown(shadeDown);
        return this;
    }

    public BNDwidgetTheme set(BNDwidgetTheme src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static BNDwidgetTheme malloc() {
        return new BNDwidgetTheme(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static BNDwidgetTheme calloc() {
        return new BNDwidgetTheme(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static BNDwidgetTheme create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new BNDwidgetTheme(MemoryUtil.memAddress(container), container);
    }

    public static BNDwidgetTheme create(long address) {
        return new BNDwidgetTheme(address, null);
    }

    @Nullable
    public static BNDwidgetTheme createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new BNDwidgetTheme(address, null);
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
    public static BNDwidgetTheme mallocStack() {
        return malloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static BNDwidgetTheme callocStack() {
        return calloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static BNDwidgetTheme mallocStack(MemoryStack stack) {
        return malloc(stack);
    }

    @Deprecated
    public static BNDwidgetTheme callocStack(MemoryStack stack) {
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

    public static BNDwidgetTheme malloc(MemoryStack stack) {
        return new BNDwidgetTheme(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static BNDwidgetTheme calloc(MemoryStack stack) {
        return new BNDwidgetTheme(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static NVGColor noutlineColor(long struct) {
        return NVGColor.create(struct + OUTLINECOLOR);
    }

    public static NVGColor nitemColor(long struct) {
        return NVGColor.create(struct + ITEMCOLOR);
    }

    public static NVGColor ninnerColor(long struct) {
        return NVGColor.create(struct + INNERCOLOR);
    }

    public static NVGColor ninnerSelectedColor(long struct) {
        return NVGColor.create(struct + INNERSELECTEDCOLOR);
    }

    public static NVGColor ntextColor(long struct) {
        return NVGColor.create(struct + TEXTCOLOR);
    }

    public static NVGColor ntextSelectedColor(long struct) {
        return NVGColor.create(struct + TEXTSELECTEDCOLOR);
    }

    public static int nshadeTop(long struct) {
        return UNSAFE.getInt((Object) null, struct + SHADETOP);
    }

    public static int nshadeDown(long struct) {
        return UNSAFE.getInt((Object) null, struct + SHADEDOWN);
    }

    public static void noutlineColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + OUTLINECOLOR, NVGColor.SIZEOF);
    }

    public static void nitemColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + ITEMCOLOR, NVGColor.SIZEOF);
    }

    public static void ninnerColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + INNERCOLOR, NVGColor.SIZEOF);
    }

    public static void ninnerSelectedColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + INNERSELECTEDCOLOR, NVGColor.SIZEOF);
    }

    public static void ntextColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + TEXTCOLOR, NVGColor.SIZEOF);
    }

    public static void ntextSelectedColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + TEXTSELECTEDCOLOR, NVGColor.SIZEOF);
    }

    public static void nshadeTop(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + SHADETOP, value);
    }

    public static void nshadeDown(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + SHADEDOWN, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/BNDwidgetTheme$Buffer.class */
    public static class Buffer extends StructBuffer<BNDwidgetTheme, Buffer> implements NativeResource {
        private static final BNDwidgetTheme ELEMENT_FACTORY = BNDwidgetTheme.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / BNDwidgetTheme.SIZEOF);
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
        public BNDwidgetTheme getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("NVGcolor")
        public NVGColor outlineColor() {
            return BNDwidgetTheme.noutlineColor(address());
        }

        @NativeType("NVGcolor")
        public NVGColor itemColor() {
            return BNDwidgetTheme.nitemColor(address());
        }

        @NativeType("NVGcolor")
        public NVGColor innerColor() {
            return BNDwidgetTheme.ninnerColor(address());
        }

        @NativeType("NVGcolor")
        public NVGColor innerSelectedColor() {
            return BNDwidgetTheme.ninnerSelectedColor(address());
        }

        @NativeType("NVGcolor")
        public NVGColor textColor() {
            return BNDwidgetTheme.ntextColor(address());
        }

        @NativeType("NVGcolor")
        public NVGColor textSelectedColor() {
            return BNDwidgetTheme.ntextSelectedColor(address());
        }

        public int shadeTop() {
            return BNDwidgetTheme.nshadeTop(address());
        }

        public int shadeDown() {
            return BNDwidgetTheme.nshadeDown(address());
        }

        public Buffer outlineColor(@NativeType("NVGcolor") NVGColor value) {
            BNDwidgetTheme.noutlineColor(address(), value);
            return this;
        }

        public Buffer outlineColor(Consumer<NVGColor> consumer) {
            consumer.accept(outlineColor());
            return this;
        }

        public Buffer itemColor(@NativeType("NVGcolor") NVGColor value) {
            BNDwidgetTheme.nitemColor(address(), value);
            return this;
        }

        public Buffer itemColor(Consumer<NVGColor> consumer) {
            consumer.accept(itemColor());
            return this;
        }

        public Buffer innerColor(@NativeType("NVGcolor") NVGColor value) {
            BNDwidgetTheme.ninnerColor(address(), value);
            return this;
        }

        public Buffer innerColor(Consumer<NVGColor> consumer) {
            consumer.accept(innerColor());
            return this;
        }

        public Buffer innerSelectedColor(@NativeType("NVGcolor") NVGColor value) {
            BNDwidgetTheme.ninnerSelectedColor(address(), value);
            return this;
        }

        public Buffer innerSelectedColor(Consumer<NVGColor> consumer) {
            consumer.accept(innerSelectedColor());
            return this;
        }

        public Buffer textColor(@NativeType("NVGcolor") NVGColor value) {
            BNDwidgetTheme.ntextColor(address(), value);
            return this;
        }

        public Buffer textColor(Consumer<NVGColor> consumer) {
            consumer.accept(textColor());
            return this;
        }

        public Buffer textSelectedColor(@NativeType("NVGcolor") NVGColor value) {
            BNDwidgetTheme.ntextSelectedColor(address(), value);
            return this;
        }

        public Buffer textSelectedColor(Consumer<NVGColor> consumer) {
            consumer.accept(textSelectedColor());
            return this;
        }

        public Buffer shadeTop(int value) {
            BNDwidgetTheme.nshadeTop(address(), value);
            return this;
        }

        public Buffer shadeDown(int value) {
            BNDwidgetTheme.nshadeDown(address(), value);
            return this;
        }
    }
}
