package org.lwjgl.system.linux;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/Visual.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/Visual.class */
public class Visual extends Struct<Visual> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int EXT_DATA;
    public static final int VISUALID;
    public static final int CLASS;
    public static final int RED_MASK;
    public static final int GREEN_MASK;
    public static final int BLUE_MASK;
    public static final int BITS_PER_RGB;
    public static final int MAP_ENTRIES;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(CLONG_SIZE), __member(4), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        EXT_DATA = layout.offsetof(0);
        VISUALID = layout.offsetof(1);
        CLASS = layout.offsetof(2);
        RED_MASK = layout.offsetof(3);
        GREEN_MASK = layout.offsetof(4);
        BLUE_MASK = layout.offsetof(5);
        BITS_PER_RGB = layout.offsetof(6);
        MAP_ENTRIES = layout.offsetof(7);
    }

    protected Visual(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public Visual create(long address, ByteBuffer container) {
        return new Visual(address, container);
    }

    public Visual(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("void *")
    public long ext_data() {
        return next_data(address());
    }

    @NativeType("VisualID")
    public long visualid() {
        return nvisualid(address());
    }

    public int class$() {
        return nclass$(address());
    }

    @NativeType("unsigned long")
    public long red_mask() {
        return nred_mask(address());
    }

    @NativeType("unsigned long")
    public long green_mask() {
        return ngreen_mask(address());
    }

    @NativeType("unsigned long")
    public long blue_mask() {
        return nblue_mask(address());
    }

    public int bits_per_rgb() {
        return nbits_per_rgb(address());
    }

    public int map_entries() {
        return nmap_entries(address());
    }

    public Visual ext_data(@NativeType("void *") long value) {
        next_data(address(), value);
        return this;
    }

    public Visual visualid(@NativeType("VisualID") long value) {
        nvisualid(address(), value);
        return this;
    }

    public Visual class$(int value) {
        nclass$(address(), value);
        return this;
    }

    public Visual red_mask(@NativeType("unsigned long") long value) {
        nred_mask(address(), value);
        return this;
    }

    public Visual green_mask(@NativeType("unsigned long") long value) {
        ngreen_mask(address(), value);
        return this;
    }

    public Visual blue_mask(@NativeType("unsigned long") long value) {
        nblue_mask(address(), value);
        return this;
    }

    public Visual bits_per_rgb(int value) {
        nbits_per_rgb(address(), value);
        return this;
    }

    public Visual map_entries(int value) {
        nmap_entries(address(), value);
        return this;
    }

    public Visual set(long ext_data, long visualid, int class$, long red_mask, long green_mask, long blue_mask, int bits_per_rgb, int map_entries) {
        ext_data(ext_data);
        visualid(visualid);
        class$(class$);
        red_mask(red_mask);
        green_mask(green_mask);
        blue_mask(blue_mask);
        bits_per_rgb(bits_per_rgb);
        map_entries(map_entries);
        return this;
    }

    public Visual set(Visual src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static Visual malloc() {
        return new Visual(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static Visual calloc() {
        return new Visual(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static Visual create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new Visual(MemoryUtil.memAddress(container), container);
    }

    public static Visual create(long address) {
        return new Visual(address, null);
    }

    public static Visual createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new Visual(address, null);
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

    public static Visual malloc(MemoryStack stack) {
        return new Visual(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static Visual calloc(MemoryStack stack) {
        return new Visual(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long next_data(long struct) {
        return MemoryUtil.memGetAddress(struct + EXT_DATA);
    }

    public static long nvisualid(long struct) {
        return MemoryUtil.memGetCLong(struct + VISUALID);
    }

    public static int nclass$(long struct) {
        return MemoryUtil.memGetInt(struct + CLASS);
    }

    public static long nred_mask(long struct) {
        return MemoryUtil.memGetCLong(struct + RED_MASK);
    }

    public static long ngreen_mask(long struct) {
        return MemoryUtil.memGetCLong(struct + GREEN_MASK);
    }

    public static long nblue_mask(long struct) {
        return MemoryUtil.memGetCLong(struct + BLUE_MASK);
    }

    public static int nbits_per_rgb(long struct) {
        return MemoryUtil.memGetInt(struct + BITS_PER_RGB);
    }

    public static int nmap_entries(long struct) {
        return MemoryUtil.memGetInt(struct + MAP_ENTRIES);
    }

    public static void next_data(long struct, long value) {
        MemoryUtil.memPutAddress(struct + EXT_DATA, value);
    }

    public static void nvisualid(long struct, long value) {
        MemoryUtil.memPutCLong(struct + VISUALID, value);
    }

    public static void nclass$(long struct, int value) {
        MemoryUtil.memPutInt(struct + CLASS, value);
    }

    public static void nred_mask(long struct, long value) {
        MemoryUtil.memPutCLong(struct + RED_MASK, value);
    }

    public static void ngreen_mask(long struct, long value) {
        MemoryUtil.memPutCLong(struct + GREEN_MASK, value);
    }

    public static void nblue_mask(long struct, long value) {
        MemoryUtil.memPutCLong(struct + BLUE_MASK, value);
    }

    public static void nbits_per_rgb(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITS_PER_RGB, value);
    }

    public static void nmap_entries(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAP_ENTRIES, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/Visual$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/Visual$Buffer.class */
    public static class Buffer extends StructBuffer<Visual, Buffer> implements NativeResource {
        private static final Visual ELEMENT_FACTORY = Visual.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / Visual.SIZEOF);
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
        public Visual getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("void *")
        public long ext_data() {
            return Visual.next_data(address());
        }

        @NativeType("VisualID")
        public long visualid() {
            return Visual.nvisualid(address());
        }

        public int class$() {
            return Visual.nclass$(address());
        }

        @NativeType("unsigned long")
        public long red_mask() {
            return Visual.nred_mask(address());
        }

        @NativeType("unsigned long")
        public long green_mask() {
            return Visual.ngreen_mask(address());
        }

        @NativeType("unsigned long")
        public long blue_mask() {
            return Visual.nblue_mask(address());
        }

        public int bits_per_rgb() {
            return Visual.nbits_per_rgb(address());
        }

        public int map_entries() {
            return Visual.nmap_entries(address());
        }

        public Buffer ext_data(@NativeType("void *") long value) {
            Visual.next_data(address(), value);
            return this;
        }

        public Buffer visualid(@NativeType("VisualID") long value) {
            Visual.nvisualid(address(), value);
            return this;
        }

        public Buffer class$(int value) {
            Visual.nclass$(address(), value);
            return this;
        }

        public Buffer red_mask(@NativeType("unsigned long") long value) {
            Visual.nred_mask(address(), value);
            return this;
        }

        public Buffer green_mask(@NativeType("unsigned long") long value) {
            Visual.ngreen_mask(address(), value);
            return this;
        }

        public Buffer blue_mask(@NativeType("unsigned long") long value) {
            Visual.nblue_mask(address(), value);
            return this;
        }

        public Buffer bits_per_rgb(int value) {
            Visual.nbits_per_rgb(address(), value);
            return this;
        }

        public Buffer map_entries(int value) {
            Visual.nmap_entries(address(), value);
            return this;
        }
    }
}
