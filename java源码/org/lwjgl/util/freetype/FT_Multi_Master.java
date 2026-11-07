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
import org.lwjgl.util.freetype.FT_MM_Axis;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Multi_Master.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Multi_Master.class */
public class FT_Multi_Master extends Struct<FT_Multi_Master> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NUM_AXIS;
    public static final int NUM_DESIGNS;
    public static final int AXIS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __array(FT_MM_Axis.SIZEOF, FT_MM_Axis.ALIGNOF, 4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NUM_AXIS = layout.offsetof(0);
        NUM_DESIGNS = layout.offsetof(1);
        AXIS = layout.offsetof(2);
    }

    protected FT_Multi_Master(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Multi_Master create(long address, ByteBuffer container) {
        return new FT_Multi_Master(address, container);
    }

    public FT_Multi_Master(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_UInt")
    public int num_axis() {
        return nnum_axis(address());
    }

    @NativeType("FT_UInt")
    public int num_designs() {
        return nnum_designs(address());
    }

    @NativeType("FT_MM_Axis[T1_MAX_MM_AXIS]")
    public FT_MM_Axis.Buffer axis() {
        return naxis(address());
    }

    public FT_MM_Axis axis(int index) {
        return naxis(address(), index);
    }

    public static FT_Multi_Master malloc() {
        return new FT_Multi_Master(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_Multi_Master calloc() {
        return new FT_Multi_Master(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_Multi_Master create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Multi_Master(MemoryUtil.memAddress(container), container);
    }

    public static FT_Multi_Master create(long address) {
        return new FT_Multi_Master(address, null);
    }

    public static FT_Multi_Master createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Multi_Master(address, null);
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

    public static FT_Multi_Master malloc(MemoryStack stack) {
        return new FT_Multi_Master(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_Multi_Master calloc(MemoryStack stack) {
        return new FT_Multi_Master(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nnum_axis(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_AXIS);
    }

    public static int nnum_designs(long struct) {
        return MemoryUtil.memGetInt(struct + NUM_DESIGNS);
    }

    public static FT_MM_Axis.Buffer naxis(long struct) {
        return FT_MM_Axis.create(struct + AXIS, 4);
    }

    public static FT_MM_Axis naxis(long struct, int index) {
        return FT_MM_Axis.create(struct + AXIS + (Checks.check(index, 4) * FT_MM_Axis.SIZEOF));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Multi_Master$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Multi_Master$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Multi_Master, Buffer> implements NativeResource {
        private static final FT_Multi_Master ELEMENT_FACTORY = FT_Multi_Master.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Multi_Master.SIZEOF);
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
        public FT_Multi_Master getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_UInt")
        public int num_axis() {
            return FT_Multi_Master.nnum_axis(address());
        }

        @NativeType("FT_UInt")
        public int num_designs() {
            return FT_Multi_Master.nnum_designs(address());
        }

        @NativeType("FT_MM_Axis[T1_MAX_MM_AXIS]")
        public FT_MM_Axis.Buffer axis() {
            return FT_Multi_Master.naxis(address());
        }

        public FT_MM_Axis axis(int index) {
            return FT_Multi_Master.naxis(address(), index);
        }
    }
}
