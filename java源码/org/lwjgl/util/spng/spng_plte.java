package org.lwjgl.util.spng;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.util.spng.spng_plte_entry;

@NativeType("struct spng_plte")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_plte.class */
public class spng_plte extends Struct<spng_plte> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int N_ENTRIES;
    public static final int ENTRIES;

    static {
        Struct.Layout layout = __struct(__member(4), __array(spng_plte_entry.SIZEOF, spng_plte_entry.ALIGNOF, 256));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        N_ENTRIES = layout.offsetof(0);
        ENTRIES = layout.offsetof(1);
    }

    protected spng_plte(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public spng_plte create(long address, ByteBuffer container) {
        return new spng_plte(address, container);
    }

    public spng_plte(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int n_entries() {
        return nn_entries(address());
    }

    @NativeType("struct spng_plte_entry[256]")
    public spng_plte_entry.Buffer entries() {
        return nentries(address());
    }

    @NativeType("struct spng_plte_entry")
    public spng_plte_entry entries(int index) {
        return nentries(address(), index);
    }

    public spng_plte entries(@NativeType("struct spng_plte_entry[256]") spng_plte_entry.Buffer value) {
        nentries(address(), value);
        return this;
    }

    public spng_plte entries(int index, @NativeType("struct spng_plte_entry") spng_plte_entry value) {
        nentries(address(), index, value);
        return this;
    }

    public spng_plte entries(Consumer<spng_plte_entry.Buffer> consumer) {
        consumer.accept(entries());
        return this;
    }

    public spng_plte entries(int index, Consumer<spng_plte_entry> consumer) {
        consumer.accept(entries(index));
        return this;
    }

    public spng_plte set(spng_plte src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static spng_plte malloc() {
        return new spng_plte(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static spng_plte calloc() {
        return new spng_plte(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static spng_plte create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_plte(MemoryUtil.memAddress(container), container);
    }

    public static spng_plte create(long address) {
        return new spng_plte(address, null);
    }

    public static spng_plte createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new spng_plte(address, null);
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

    public static spng_plte malloc(MemoryStack stack) {
        return new spng_plte(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static spng_plte calloc(MemoryStack stack) {
        return new spng_plte(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nn_entries(long struct) {
        return MemoryUtil.memGetInt(struct + N_ENTRIES);
    }

    public static spng_plte_entry.Buffer nentries(long struct) {
        return spng_plte_entry.create(struct + ENTRIES, nn_entries(struct));
    }

    public static spng_plte_entry nentries(long struct, int index) {
        return spng_plte_entry.create(struct + ENTRIES + (Checks.check(index, nn_entries(struct)) * spng_plte_entry.SIZEOF));
    }

    public static void nn_entries(long struct, int value) {
        MemoryUtil.memPutInt(struct + N_ENTRIES, value);
    }

    public static void nentries(long struct, spng_plte_entry.Buffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 256);
        }
        MemoryUtil.memCopy(value.address(), struct + ENTRIES, value.remaining() * spng_plte_entry.SIZEOF);
        nn_entries(struct, value.remaining());
    }

    public static void nentries(long struct, int index, spng_plte_entry value) {
        MemoryUtil.memCopy(value.address(), struct + ENTRIES + (Checks.check(index, 256) * spng_plte_entry.SIZEOF), spng_plte_entry.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_plte$Buffer.class */
    public static class Buffer extends StructBuffer<spng_plte, Buffer> implements NativeResource {
        private static final spng_plte ELEMENT_FACTORY = spng_plte.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / spng_plte.SIZEOF);
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
        public spng_plte getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int n_entries() {
            return spng_plte.nn_entries(address());
        }

        @NativeType("struct spng_plte_entry[256]")
        public spng_plte_entry.Buffer entries() {
            return spng_plte.nentries(address());
        }

        @NativeType("struct spng_plte_entry")
        public spng_plte_entry entries(int index) {
            return spng_plte.nentries(address(), index);
        }

        public Buffer entries(@NativeType("struct spng_plte_entry[256]") spng_plte_entry.Buffer value) {
            spng_plte.nentries(address(), value);
            return this;
        }

        public Buffer entries(int index, @NativeType("struct spng_plte_entry") spng_plte_entry value) {
            spng_plte.nentries(address(), index, value);
            return this;
        }

        public Buffer entries(Consumer<spng_plte_entry.Buffer> consumer) {
            consumer.accept(entries());
            return this;
        }

        public Buffer entries(int index, Consumer<spng_plte_entry> consumer) {
            consumer.accept(entries(index));
            return this;
        }
    }
}
