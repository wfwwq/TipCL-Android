package org.lwjgl.util.freetype;

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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/SVG_RendererHooks.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/SVG_RendererHooks.class */
public class SVG_RendererHooks extends Struct<SVG_RendererHooks> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int INIT_SVG;
    public static final int FREE_SVG;
    public static final int RENDER_SVG;
    public static final int PRESET_SLOT;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        INIT_SVG = layout.offsetof(0);
        FREE_SVG = layout.offsetof(1);
        RENDER_SVG = layout.offsetof(2);
        PRESET_SLOT = layout.offsetof(3);
    }

    protected SVG_RendererHooks(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SVG_RendererHooks create(long address, ByteBuffer container) {
        return new SVG_RendererHooks(address, container);
    }

    public SVG_RendererHooks(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public SVG_Lib_Init_Func init_svg() {
        return ninit_svg(address());
    }

    public SVG_Lib_Free_Func free_svg() {
        return nfree_svg(address());
    }

    public SVG_Lib_Render_Func render_svg() {
        return nrender_svg(address());
    }

    public SVG_Lib_Preset_Slot_Func preset_slot() {
        return npreset_slot(address());
    }

    public SVG_RendererHooks init_svg(@NativeType("SVG_Lib_Init_Func") SVG_Lib_Init_FuncI value) {
        ninit_svg(address(), value);
        return this;
    }

    public SVG_RendererHooks free_svg(@NativeType("SVG_Lib_Free_Func") SVG_Lib_Free_FuncI value) {
        nfree_svg(address(), value);
        return this;
    }

    public SVG_RendererHooks render_svg(@NativeType("SVG_Lib_Render_Func") SVG_Lib_Render_FuncI value) {
        nrender_svg(address(), value);
        return this;
    }

    public SVG_RendererHooks preset_slot(@NativeType("SVG_Lib_Preset_Slot_Func") SVG_Lib_Preset_Slot_FuncI value) {
        npreset_slot(address(), value);
        return this;
    }

    public SVG_RendererHooks set(SVG_Lib_Init_FuncI init_svg, SVG_Lib_Free_FuncI free_svg, SVG_Lib_Render_FuncI render_svg, SVG_Lib_Preset_Slot_FuncI preset_slot) {
        init_svg(init_svg);
        free_svg(free_svg);
        render_svg(render_svg);
        preset_slot(preset_slot);
        return this;
    }

    public SVG_RendererHooks set(SVG_RendererHooks src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SVG_RendererHooks malloc() {
        return new SVG_RendererHooks(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SVG_RendererHooks calloc() {
        return new SVG_RendererHooks(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SVG_RendererHooks create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SVG_RendererHooks(MemoryUtil.memAddress(container), container);
    }

    public static SVG_RendererHooks create(long address) {
        return new SVG_RendererHooks(address, null);
    }

    public static SVG_RendererHooks createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SVG_RendererHooks(address, null);
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

    public static SVG_RendererHooks malloc(MemoryStack stack) {
        return new SVG_RendererHooks(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SVG_RendererHooks calloc(MemoryStack stack) {
        return new SVG_RendererHooks(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static SVG_Lib_Init_Func ninit_svg(long struct) {
        return SVG_Lib_Init_Func.create(MemoryUtil.memGetAddress(struct + INIT_SVG));
    }

    public static SVG_Lib_Free_Func nfree_svg(long struct) {
        return SVG_Lib_Free_Func.create(MemoryUtil.memGetAddress(struct + FREE_SVG));
    }

    public static SVG_Lib_Render_Func nrender_svg(long struct) {
        return SVG_Lib_Render_Func.create(MemoryUtil.memGetAddress(struct + RENDER_SVG));
    }

    public static SVG_Lib_Preset_Slot_Func npreset_slot(long struct) {
        return SVG_Lib_Preset_Slot_Func.create(MemoryUtil.memGetAddress(struct + PRESET_SLOT));
    }

    public static void ninit_svg(long struct, SVG_Lib_Init_FuncI value) {
        MemoryUtil.memPutAddress(struct + INIT_SVG, value.address());
    }

    public static void nfree_svg(long struct, SVG_Lib_Free_FuncI value) {
        MemoryUtil.memPutAddress(struct + FREE_SVG, value.address());
    }

    public static void nrender_svg(long struct, SVG_Lib_Render_FuncI value) {
        MemoryUtil.memPutAddress(struct + RENDER_SVG, value.address());
    }

    public static void npreset_slot(long struct, SVG_Lib_Preset_Slot_FuncI value) {
        MemoryUtil.memPutAddress(struct + PRESET_SLOT, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + INIT_SVG));
        Checks.check(MemoryUtil.memGetAddress(struct + FREE_SVG));
        Checks.check(MemoryUtil.memGetAddress(struct + RENDER_SVG));
        Checks.check(MemoryUtil.memGetAddress(struct + PRESET_SLOT));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/SVG_RendererHooks$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/SVG_RendererHooks$Buffer.class */
    public static class Buffer extends StructBuffer<SVG_RendererHooks, Buffer> implements NativeResource {
        private static final SVG_RendererHooks ELEMENT_FACTORY = SVG_RendererHooks.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SVG_RendererHooks.SIZEOF);
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
        public SVG_RendererHooks getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public SVG_Lib_Init_Func init_svg() {
            return SVG_RendererHooks.ninit_svg(address());
        }

        public SVG_Lib_Free_Func free_svg() {
            return SVG_RendererHooks.nfree_svg(address());
        }

        public SVG_Lib_Render_Func render_svg() {
            return SVG_RendererHooks.nrender_svg(address());
        }

        public SVG_Lib_Preset_Slot_Func preset_slot() {
            return SVG_RendererHooks.npreset_slot(address());
        }

        public Buffer init_svg(@NativeType("SVG_Lib_Init_Func") SVG_Lib_Init_FuncI value) {
            SVG_RendererHooks.ninit_svg(address(), value);
            return this;
        }

        public Buffer free_svg(@NativeType("SVG_Lib_Free_Func") SVG_Lib_Free_FuncI value) {
            SVG_RendererHooks.nfree_svg(address(), value);
            return this;
        }

        public Buffer render_svg(@NativeType("SVG_Lib_Render_Func") SVG_Lib_Render_FuncI value) {
            SVG_RendererHooks.nrender_svg(address(), value);
            return this;
        }

        public Buffer preset_slot(@NativeType("SVG_Lib_Preset_Slot_Func") SVG_Lib_Preset_Slot_FuncI value) {
            SVG_RendererHooks.npreset_slot(address(), value);
            return this;
        }
    }
}
