package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoVP9ColorConfigFlags.class */
public class StdVideoVP9ColorConfigFlags extends Struct<StdVideoVP9ColorConfigFlags> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BITFIELD0;

    static {
        Struct.Layout layout = __struct(__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BITFIELD0 = layout.offsetof(0);
    }

    protected StdVideoVP9ColorConfigFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoVP9ColorConfigFlags create(long address, ByteBuffer container) {
        return new StdVideoVP9ColorConfigFlags(address, container);
    }

    public StdVideoVP9ColorConfigFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean color_range() {
        return ncolor_range(address()) != 0;
    }

    public StdVideoVP9ColorConfigFlags color_range(@NativeType("uint32_t") boolean value) {
        ncolor_range(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoVP9ColorConfigFlags set(StdVideoVP9ColorConfigFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoVP9ColorConfigFlags malloc() {
        return new StdVideoVP9ColorConfigFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoVP9ColorConfigFlags calloc() {
        return new StdVideoVP9ColorConfigFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoVP9ColorConfigFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoVP9ColorConfigFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoVP9ColorConfigFlags create(long address) {
        return new StdVideoVP9ColorConfigFlags(address, null);
    }

    public static StdVideoVP9ColorConfigFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoVP9ColorConfigFlags(address, null);
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

    public static StdVideoVP9ColorConfigFlags malloc(MemoryStack stack) {
        return new StdVideoVP9ColorConfigFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoVP9ColorConfigFlags calloc(MemoryStack stack) {
        return new StdVideoVP9ColorConfigFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nbitfield0(long struct) {
        return MemoryUtil.memGetInt(struct + BITFIELD0);
    }

    public static int ncolor_range(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int nreserved(long struct) {
        return nbitfield0(struct) >>> 1;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void ncolor_range(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void nreserved(long struct, int value) {
        nbitfield0(struct, (value << 1) | (nbitfield0(struct) & 1));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoVP9ColorConfigFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoVP9ColorConfigFlags, Buffer> implements NativeResource {
        private static final StdVideoVP9ColorConfigFlags ELEMENT_FACTORY = StdVideoVP9ColorConfigFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoVP9ColorConfigFlags.SIZEOF);
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
        public StdVideoVP9ColorConfigFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean color_range() {
            return StdVideoVP9ColorConfigFlags.ncolor_range(address()) != 0;
        }

        public Buffer color_range(@NativeType("uint32_t") boolean value) {
            StdVideoVP9ColorConfigFlags.ncolor_range(address(), value ? 1 : 0);
            return this;
        }
    }
}
