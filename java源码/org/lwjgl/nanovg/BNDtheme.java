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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/BNDtheme.class */
public class BNDtheme extends Struct<BNDtheme> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BACKGROUNDCOLOR;
    public static final int REGULARTHEME;
    public static final int TOOLTHEME;
    public static final int RADIOTHEME;
    public static final int TEXTFIELDTHEME;
    public static final int OPTIONTHEME;
    public static final int CHOICETHEME;
    public static final int NUMBERFIELDTHEME;
    public static final int SLIDERTHEME;
    public static final int SCROLLBARTHEME;
    public static final int TOOLTIPTHEME;
    public static final int MENUTHEME;
    public static final int MENUITEMTHEME;
    public static final int NODETHEME;

    static {
        Struct.Layout layout = __struct(__member(NVGColor.SIZEOF, NVGColor.ALIGNOF), __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF), __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF), __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF), __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF), __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF), __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF), __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF), __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF), __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF), __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF), __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF), __member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF), __member(BNDnodeTheme.SIZEOF, BNDnodeTheme.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BACKGROUNDCOLOR = layout.offsetof(0);
        REGULARTHEME = layout.offsetof(1);
        TOOLTHEME = layout.offsetof(2);
        RADIOTHEME = layout.offsetof(3);
        TEXTFIELDTHEME = layout.offsetof(4);
        OPTIONTHEME = layout.offsetof(5);
        CHOICETHEME = layout.offsetof(6);
        NUMBERFIELDTHEME = layout.offsetof(7);
        SLIDERTHEME = layout.offsetof(8);
        SCROLLBARTHEME = layout.offsetof(9);
        TOOLTIPTHEME = layout.offsetof(10);
        MENUTHEME = layout.offsetof(11);
        MENUITEMTHEME = layout.offsetof(12);
        NODETHEME = layout.offsetof(13);
    }

    protected BNDtheme(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public BNDtheme create(long address, @Nullable ByteBuffer container) {
        return new BNDtheme(address, container);
    }

    public BNDtheme(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("NVGcolor")
    public NVGColor backgroundColor() {
        return nbackgroundColor(address());
    }

    public BNDwidgetTheme regularTheme() {
        return nregularTheme(address());
    }

    public BNDwidgetTheme toolTheme() {
        return ntoolTheme(address());
    }

    public BNDwidgetTheme radioTheme() {
        return nradioTheme(address());
    }

    public BNDwidgetTheme textFieldTheme() {
        return ntextFieldTheme(address());
    }

    public BNDwidgetTheme optionTheme() {
        return noptionTheme(address());
    }

    public BNDwidgetTheme choiceTheme() {
        return nchoiceTheme(address());
    }

    public BNDwidgetTheme numberFieldTheme() {
        return nnumberFieldTheme(address());
    }

    public BNDwidgetTheme sliderTheme() {
        return nsliderTheme(address());
    }

    public BNDwidgetTheme scrollBarTheme() {
        return nscrollBarTheme(address());
    }

    public BNDwidgetTheme tooltipTheme() {
        return ntooltipTheme(address());
    }

    public BNDwidgetTheme menuTheme() {
        return nmenuTheme(address());
    }

    public BNDwidgetTheme menuItemTheme() {
        return nmenuItemTheme(address());
    }

    public BNDnodeTheme nodeTheme() {
        return nnodeTheme(address());
    }

    public BNDtheme backgroundColor(@NativeType("NVGcolor") NVGColor value) {
        nbackgroundColor(address(), value);
        return this;
    }

    public BNDtheme backgroundColor(Consumer<NVGColor> consumer) {
        consumer.accept(backgroundColor());
        return this;
    }

    public BNDtheme regularTheme(BNDwidgetTheme value) {
        nregularTheme(address(), value);
        return this;
    }

    public BNDtheme regularTheme(Consumer<BNDwidgetTheme> consumer) {
        consumer.accept(regularTheme());
        return this;
    }

    public BNDtheme toolTheme(BNDwidgetTheme value) {
        ntoolTheme(address(), value);
        return this;
    }

    public BNDtheme toolTheme(Consumer<BNDwidgetTheme> consumer) {
        consumer.accept(toolTheme());
        return this;
    }

    public BNDtheme radioTheme(BNDwidgetTheme value) {
        nradioTheme(address(), value);
        return this;
    }

    public BNDtheme radioTheme(Consumer<BNDwidgetTheme> consumer) {
        consumer.accept(radioTheme());
        return this;
    }

    public BNDtheme textFieldTheme(BNDwidgetTheme value) {
        ntextFieldTheme(address(), value);
        return this;
    }

    public BNDtheme textFieldTheme(Consumer<BNDwidgetTheme> consumer) {
        consumer.accept(textFieldTheme());
        return this;
    }

    public BNDtheme optionTheme(BNDwidgetTheme value) {
        noptionTheme(address(), value);
        return this;
    }

    public BNDtheme optionTheme(Consumer<BNDwidgetTheme> consumer) {
        consumer.accept(optionTheme());
        return this;
    }

    public BNDtheme choiceTheme(BNDwidgetTheme value) {
        nchoiceTheme(address(), value);
        return this;
    }

    public BNDtheme choiceTheme(Consumer<BNDwidgetTheme> consumer) {
        consumer.accept(choiceTheme());
        return this;
    }

    public BNDtheme numberFieldTheme(BNDwidgetTheme value) {
        nnumberFieldTheme(address(), value);
        return this;
    }

    public BNDtheme numberFieldTheme(Consumer<BNDwidgetTheme> consumer) {
        consumer.accept(numberFieldTheme());
        return this;
    }

    public BNDtheme sliderTheme(BNDwidgetTheme value) {
        nsliderTheme(address(), value);
        return this;
    }

    public BNDtheme sliderTheme(Consumer<BNDwidgetTheme> consumer) {
        consumer.accept(sliderTheme());
        return this;
    }

    public BNDtheme scrollBarTheme(BNDwidgetTheme value) {
        nscrollBarTheme(address(), value);
        return this;
    }

    public BNDtheme scrollBarTheme(Consumer<BNDwidgetTheme> consumer) {
        consumer.accept(scrollBarTheme());
        return this;
    }

    public BNDtheme tooltipTheme(BNDwidgetTheme value) {
        ntooltipTheme(address(), value);
        return this;
    }

    public BNDtheme tooltipTheme(Consumer<BNDwidgetTheme> consumer) {
        consumer.accept(tooltipTheme());
        return this;
    }

    public BNDtheme menuTheme(BNDwidgetTheme value) {
        nmenuTheme(address(), value);
        return this;
    }

    public BNDtheme menuTheme(Consumer<BNDwidgetTheme> consumer) {
        consumer.accept(menuTheme());
        return this;
    }

    public BNDtheme menuItemTheme(BNDwidgetTheme value) {
        nmenuItemTheme(address(), value);
        return this;
    }

    public BNDtheme menuItemTheme(Consumer<BNDwidgetTheme> consumer) {
        consumer.accept(menuItemTheme());
        return this;
    }

    public BNDtheme nodeTheme(BNDnodeTheme value) {
        nnodeTheme(address(), value);
        return this;
    }

    public BNDtheme nodeTheme(Consumer<BNDnodeTheme> consumer) {
        consumer.accept(nodeTheme());
        return this;
    }

    public BNDtheme set(NVGColor backgroundColor, BNDwidgetTheme regularTheme, BNDwidgetTheme toolTheme, BNDwidgetTheme radioTheme, BNDwidgetTheme textFieldTheme, BNDwidgetTheme optionTheme, BNDwidgetTheme choiceTheme, BNDwidgetTheme numberFieldTheme, BNDwidgetTheme sliderTheme, BNDwidgetTheme scrollBarTheme, BNDwidgetTheme tooltipTheme, BNDwidgetTheme menuTheme, BNDwidgetTheme menuItemTheme, BNDnodeTheme nodeTheme) {
        backgroundColor(backgroundColor);
        regularTheme(regularTheme);
        toolTheme(toolTheme);
        radioTheme(radioTheme);
        textFieldTheme(textFieldTheme);
        optionTheme(optionTheme);
        choiceTheme(choiceTheme);
        numberFieldTheme(numberFieldTheme);
        sliderTheme(sliderTheme);
        scrollBarTheme(scrollBarTheme);
        tooltipTheme(tooltipTheme);
        menuTheme(menuTheme);
        menuItemTheme(menuItemTheme);
        nodeTheme(nodeTheme);
        return this;
    }

    public BNDtheme set(BNDtheme src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static BNDtheme malloc() {
        return new BNDtheme(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static BNDtheme calloc() {
        return new BNDtheme(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static BNDtheme create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new BNDtheme(MemoryUtil.memAddress(container), container);
    }

    public static BNDtheme create(long address) {
        return new BNDtheme(address, null);
    }

    @Nullable
    public static BNDtheme createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new BNDtheme(address, null);
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
    public static BNDtheme mallocStack() {
        return malloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static BNDtheme callocStack() {
        return calloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static BNDtheme mallocStack(MemoryStack stack) {
        return malloc(stack);
    }

    @Deprecated
    public static BNDtheme callocStack(MemoryStack stack) {
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

    public static BNDtheme malloc(MemoryStack stack) {
        return new BNDtheme(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static BNDtheme calloc(MemoryStack stack) {
        return new BNDtheme(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static NVGColor nbackgroundColor(long struct) {
        return NVGColor.create(struct + BACKGROUNDCOLOR);
    }

    public static BNDwidgetTheme nregularTheme(long struct) {
        return BNDwidgetTheme.create(struct + REGULARTHEME);
    }

    public static BNDwidgetTheme ntoolTheme(long struct) {
        return BNDwidgetTheme.create(struct + TOOLTHEME);
    }

    public static BNDwidgetTheme nradioTheme(long struct) {
        return BNDwidgetTheme.create(struct + RADIOTHEME);
    }

    public static BNDwidgetTheme ntextFieldTheme(long struct) {
        return BNDwidgetTheme.create(struct + TEXTFIELDTHEME);
    }

    public static BNDwidgetTheme noptionTheme(long struct) {
        return BNDwidgetTheme.create(struct + OPTIONTHEME);
    }

    public static BNDwidgetTheme nchoiceTheme(long struct) {
        return BNDwidgetTheme.create(struct + CHOICETHEME);
    }

    public static BNDwidgetTheme nnumberFieldTheme(long struct) {
        return BNDwidgetTheme.create(struct + NUMBERFIELDTHEME);
    }

    public static BNDwidgetTheme nsliderTheme(long struct) {
        return BNDwidgetTheme.create(struct + SLIDERTHEME);
    }

    public static BNDwidgetTheme nscrollBarTheme(long struct) {
        return BNDwidgetTheme.create(struct + SCROLLBARTHEME);
    }

    public static BNDwidgetTheme ntooltipTheme(long struct) {
        return BNDwidgetTheme.create(struct + TOOLTIPTHEME);
    }

    public static BNDwidgetTheme nmenuTheme(long struct) {
        return BNDwidgetTheme.create(struct + MENUTHEME);
    }

    public static BNDwidgetTheme nmenuItemTheme(long struct) {
        return BNDwidgetTheme.create(struct + MENUITEMTHEME);
    }

    public static BNDnodeTheme nnodeTheme(long struct) {
        return BNDnodeTheme.create(struct + NODETHEME);
    }

    public static void nbackgroundColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + BACKGROUNDCOLOR, NVGColor.SIZEOF);
    }

    public static void nregularTheme(long struct, BNDwidgetTheme value) {
        MemoryUtil.memCopy(value.address(), struct + REGULARTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void ntoolTheme(long struct, BNDwidgetTheme value) {
        MemoryUtil.memCopy(value.address(), struct + TOOLTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void nradioTheme(long struct, BNDwidgetTheme value) {
        MemoryUtil.memCopy(value.address(), struct + RADIOTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void ntextFieldTheme(long struct, BNDwidgetTheme value) {
        MemoryUtil.memCopy(value.address(), struct + TEXTFIELDTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void noptionTheme(long struct, BNDwidgetTheme value) {
        MemoryUtil.memCopy(value.address(), struct + OPTIONTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void nchoiceTheme(long struct, BNDwidgetTheme value) {
        MemoryUtil.memCopy(value.address(), struct + CHOICETHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void nnumberFieldTheme(long struct, BNDwidgetTheme value) {
        MemoryUtil.memCopy(value.address(), struct + NUMBERFIELDTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void nsliderTheme(long struct, BNDwidgetTheme value) {
        MemoryUtil.memCopy(value.address(), struct + SLIDERTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void nscrollBarTheme(long struct, BNDwidgetTheme value) {
        MemoryUtil.memCopy(value.address(), struct + SCROLLBARTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void ntooltipTheme(long struct, BNDwidgetTheme value) {
        MemoryUtil.memCopy(value.address(), struct + TOOLTIPTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void nmenuTheme(long struct, BNDwidgetTheme value) {
        MemoryUtil.memCopy(value.address(), struct + MENUTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void nmenuItemTheme(long struct, BNDwidgetTheme value) {
        MemoryUtil.memCopy(value.address(), struct + MENUITEMTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void nnodeTheme(long struct, BNDnodeTheme value) {
        MemoryUtil.memCopy(value.address(), struct + NODETHEME, BNDnodeTheme.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/BNDtheme$Buffer.class */
    public static class Buffer extends StructBuffer<BNDtheme, Buffer> implements NativeResource {
        private static final BNDtheme ELEMENT_FACTORY = BNDtheme.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / BNDtheme.SIZEOF);
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
        public BNDtheme getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("NVGcolor")
        public NVGColor backgroundColor() {
            return BNDtheme.nbackgroundColor(address());
        }

        public BNDwidgetTheme regularTheme() {
            return BNDtheme.nregularTheme(address());
        }

        public BNDwidgetTheme toolTheme() {
            return BNDtheme.ntoolTheme(address());
        }

        public BNDwidgetTheme radioTheme() {
            return BNDtheme.nradioTheme(address());
        }

        public BNDwidgetTheme textFieldTheme() {
            return BNDtheme.ntextFieldTheme(address());
        }

        public BNDwidgetTheme optionTheme() {
            return BNDtheme.noptionTheme(address());
        }

        public BNDwidgetTheme choiceTheme() {
            return BNDtheme.nchoiceTheme(address());
        }

        public BNDwidgetTheme numberFieldTheme() {
            return BNDtheme.nnumberFieldTheme(address());
        }

        public BNDwidgetTheme sliderTheme() {
            return BNDtheme.nsliderTheme(address());
        }

        public BNDwidgetTheme scrollBarTheme() {
            return BNDtheme.nscrollBarTheme(address());
        }

        public BNDwidgetTheme tooltipTheme() {
            return BNDtheme.ntooltipTheme(address());
        }

        public BNDwidgetTheme menuTheme() {
            return BNDtheme.nmenuTheme(address());
        }

        public BNDwidgetTheme menuItemTheme() {
            return BNDtheme.nmenuItemTheme(address());
        }

        public BNDnodeTheme nodeTheme() {
            return BNDtheme.nnodeTheme(address());
        }

        public Buffer backgroundColor(@NativeType("NVGcolor") NVGColor value) {
            BNDtheme.nbackgroundColor(address(), value);
            return this;
        }

        public Buffer backgroundColor(Consumer<NVGColor> consumer) {
            consumer.accept(backgroundColor());
            return this;
        }

        public Buffer regularTheme(BNDwidgetTheme value) {
            BNDtheme.nregularTheme(address(), value);
            return this;
        }

        public Buffer regularTheme(Consumer<BNDwidgetTheme> consumer) {
            consumer.accept(regularTheme());
            return this;
        }

        public Buffer toolTheme(BNDwidgetTheme value) {
            BNDtheme.ntoolTheme(address(), value);
            return this;
        }

        public Buffer toolTheme(Consumer<BNDwidgetTheme> consumer) {
            consumer.accept(toolTheme());
            return this;
        }

        public Buffer radioTheme(BNDwidgetTheme value) {
            BNDtheme.nradioTheme(address(), value);
            return this;
        }

        public Buffer radioTheme(Consumer<BNDwidgetTheme> consumer) {
            consumer.accept(radioTheme());
            return this;
        }

        public Buffer textFieldTheme(BNDwidgetTheme value) {
            BNDtheme.ntextFieldTheme(address(), value);
            return this;
        }

        public Buffer textFieldTheme(Consumer<BNDwidgetTheme> consumer) {
            consumer.accept(textFieldTheme());
            return this;
        }

        public Buffer optionTheme(BNDwidgetTheme value) {
            BNDtheme.noptionTheme(address(), value);
            return this;
        }

        public Buffer optionTheme(Consumer<BNDwidgetTheme> consumer) {
            consumer.accept(optionTheme());
            return this;
        }

        public Buffer choiceTheme(BNDwidgetTheme value) {
            BNDtheme.nchoiceTheme(address(), value);
            return this;
        }

        public Buffer choiceTheme(Consumer<BNDwidgetTheme> consumer) {
            consumer.accept(choiceTheme());
            return this;
        }

        public Buffer numberFieldTheme(BNDwidgetTheme value) {
            BNDtheme.nnumberFieldTheme(address(), value);
            return this;
        }

        public Buffer numberFieldTheme(Consumer<BNDwidgetTheme> consumer) {
            consumer.accept(numberFieldTheme());
            return this;
        }

        public Buffer sliderTheme(BNDwidgetTheme value) {
            BNDtheme.nsliderTheme(address(), value);
            return this;
        }

        public Buffer sliderTheme(Consumer<BNDwidgetTheme> consumer) {
            consumer.accept(sliderTheme());
            return this;
        }

        public Buffer scrollBarTheme(BNDwidgetTheme value) {
            BNDtheme.nscrollBarTheme(address(), value);
            return this;
        }

        public Buffer scrollBarTheme(Consumer<BNDwidgetTheme> consumer) {
            consumer.accept(scrollBarTheme());
            return this;
        }

        public Buffer tooltipTheme(BNDwidgetTheme value) {
            BNDtheme.ntooltipTheme(address(), value);
            return this;
        }

        public Buffer tooltipTheme(Consumer<BNDwidgetTheme> consumer) {
            consumer.accept(tooltipTheme());
            return this;
        }

        public Buffer menuTheme(BNDwidgetTheme value) {
            BNDtheme.nmenuTheme(address(), value);
            return this;
        }

        public Buffer menuTheme(Consumer<BNDwidgetTheme> consumer) {
            consumer.accept(menuTheme());
            return this;
        }

        public Buffer menuItemTheme(BNDwidgetTheme value) {
            BNDtheme.nmenuItemTheme(address(), value);
            return this;
        }

        public Buffer menuItemTheme(Consumer<BNDwidgetTheme> consumer) {
            consumer.accept(menuItemTheme());
            return this;
        }

        public Buffer nodeTheme(BNDnodeTheme value) {
            BNDtheme.nnodeTheme(address(), value);
            return this;
        }

        public Buffer nodeTheme(Consumer<BNDnodeTheme> consumer) {
            consumer.accept(nodeTheme());
            return this;
        }
    }
}
