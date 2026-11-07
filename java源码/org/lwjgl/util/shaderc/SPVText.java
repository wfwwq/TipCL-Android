package org.lwjgl.util.shaderc;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spv_text_t")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPVText.class */
public class SPVText extends Struct<SPVText> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STR;
    public static final int LENGTH;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STR = layout.offsetof(0);
        LENGTH = layout.offsetof(1);
    }

    protected SPVText(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SPVText create(long address, ByteBuffer container) {
        return new SPVText(address, container);
    }

    public SPVText(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("char const *")
    public ByteBuffer str() {
        return nstr(address());
    }

    @NativeType("char const *")
    public String strString() {
        return nstrString(address());
    }

    @NativeType("size_t")
    public long length() {
        return nlength(address());
    }

    public static SPVText malloc() {
        return new SPVText(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SPVText calloc() {
        return new SPVText(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SPVText create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SPVText(MemoryUtil.memAddress(container), container);
    }

    public static SPVText create(long address) {
        return new SPVText(address, null);
    }

    public static SPVText createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SPVText(address, null);
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

    public static SPVText malloc(MemoryStack stack) {
        return new SPVText(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SPVText calloc(MemoryStack stack) {
        return new SPVText(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer nstr(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + STR));
    }

    public static String nstrString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + STR));
    }

    public static long nlength(long struct) {
        return MemoryUtil.memGetAddress(struct + LENGTH);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPVText$Buffer.class */
    public static class Buffer extends StructBuffer<SPVText, Buffer> implements NativeResource {
        private static final SPVText ELEMENT_FACTORY = SPVText.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SPVText.SIZEOF);
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
        public SPVText getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("char const *")
        public ByteBuffer str() {
            return SPVText.nstr(address());
        }

        @NativeType("char const *")
        public String strString() {
            return SPVText.nstrString(address());
        }

        @NativeType("size_t")
        public long length() {
            return SPVText.nlength(address());
        }
    }
}
