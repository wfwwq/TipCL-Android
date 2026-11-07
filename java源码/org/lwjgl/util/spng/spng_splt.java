package org.lwjgl.util.spng;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.util.spng.spng_splt_entry;

@NativeType("struct spng_splt")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_splt.class */
public class spng_splt extends Struct<spng_splt> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NAME;
    public static final int SAMPLE_DEPTH;
    public static final int N_ENTRIES;
    public static final int ENTRIES;

    static {
        Struct.Layout layout = __struct(__array(1, 80), __member(1), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NAME = layout.offsetof(0);
        SAMPLE_DEPTH = layout.offsetof(1);
        N_ENTRIES = layout.offsetof(2);
        ENTRIES = layout.offsetof(3);
    }

    protected spng_splt(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public spng_splt create(long address, ByteBuffer container) {
        return new spng_splt(address, container);
    }

    public spng_splt(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("char[80]")
    public ByteBuffer name() {
        return nname(address());
    }

    @NativeType("char[80]")
    public String nameString() {
        return nnameString(address());
    }

    @NativeType("uint8_t")
    public byte sample_depth() {
        return nsample_depth(address());
    }

    @NativeType("uint32_t")
    public int n_entries() {
        return nn_entries(address());
    }

    @NativeType("struct spng_splt_entry *")
    public spng_splt_entry.Buffer entries() {
        return nentries(address());
    }

    public spng_splt name(@NativeType("char[80]") ByteBuffer value) {
        nname(address(), value);
        return this;
    }

    public spng_splt sample_depth(@NativeType("uint8_t") byte value) {
        nsample_depth(address(), value);
        return this;
    }

    public spng_splt entries(@NativeType("struct spng_splt_entry *") spng_splt_entry.Buffer value) {
        nentries(address(), value);
        return this;
    }

    public spng_splt set(ByteBuffer name, byte sample_depth, spng_splt_entry.Buffer entries) {
        name(name);
        sample_depth(sample_depth);
        entries(entries);
        return this;
    }

    public spng_splt set(spng_splt src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static spng_splt malloc() {
        return new spng_splt(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static spng_splt calloc() {
        return new spng_splt(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static spng_splt create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_splt(MemoryUtil.memAddress(container), container);
    }

    public static spng_splt create(long address) {
        return new spng_splt(address, null);
    }

    public static spng_splt createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new spng_splt(address, null);
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

    public static spng_splt malloc(MemoryStack stack) {
        return new spng_splt(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static spng_splt calloc(MemoryStack stack) {
        return new spng_splt(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer nname(long struct) {
        return MemoryUtil.memByteBuffer(struct + NAME, 80);
    }

    public static String nnameString(long struct) {
        return MemoryUtil.memASCII(struct + NAME);
    }

    public static byte nsample_depth(long struct) {
        return MemoryUtil.memGetByte(struct + SAMPLE_DEPTH);
    }

    public static int nn_entries(long struct) {
        return MemoryUtil.memGetInt(struct + N_ENTRIES);
    }

    public static spng_splt_entry.Buffer nentries(long struct) {
        return spng_splt_entry.create(MemoryUtil.memGetAddress(struct + ENTRIES), nn_entries(struct));
    }

    public static void nname(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
            Checks.checkGT(value, 80);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + NAME, value.remaining());
    }

    public static void nsample_depth(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SAMPLE_DEPTH, value);
    }

    public static void nn_entries(long struct, int value) {
        MemoryUtil.memPutInt(struct + N_ENTRIES, value);
    }

    public static void nentries(long struct, spng_splt_entry.Buffer value) {
        MemoryUtil.memPutAddress(struct + ENTRIES, value.address());
        nn_entries(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + ENTRIES));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_splt$Buffer.class */
    public static class Buffer extends StructBuffer<spng_splt, Buffer> implements NativeResource {
        private static final spng_splt ELEMENT_FACTORY = spng_splt.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / spng_splt.SIZEOF);
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
        public spng_splt getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("char[80]")
        public ByteBuffer name() {
            return spng_splt.nname(address());
        }

        @NativeType("char[80]")
        public String nameString() {
            return spng_splt.nnameString(address());
        }

        @NativeType("uint8_t")
        public byte sample_depth() {
            return spng_splt.nsample_depth(address());
        }

        @NativeType("uint32_t")
        public int n_entries() {
            return spng_splt.nn_entries(address());
        }

        @NativeType("struct spng_splt_entry *")
        public spng_splt_entry.Buffer entries() {
            return spng_splt.nentries(address());
        }

        public Buffer name(@NativeType("char[80]") ByteBuffer value) {
            spng_splt.nname(address(), value);
            return this;
        }

        public Buffer sample_depth(@NativeType("uint8_t") byte value) {
            spng_splt.nsample_depth(address(), value);
            return this;
        }

        public Buffer entries(@NativeType("struct spng_splt_entry *") spng_splt_entry.Buffer value) {
            spng_splt.nentries(address(), value);
            return this;
        }
    }
}
