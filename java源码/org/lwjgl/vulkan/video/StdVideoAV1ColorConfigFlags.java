package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1ColorConfigFlags.class */
public class StdVideoAV1ColorConfigFlags extends Struct<StdVideoAV1ColorConfigFlags> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BITFIELD0;
    public static final int BITFIELD1;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BITFIELD0 = layout.offsetof(0);
        BITFIELD1 = layout.offsetof(1);
    }

    protected StdVideoAV1ColorConfigFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoAV1ColorConfigFlags create(long address, ByteBuffer container) {
        return new StdVideoAV1ColorConfigFlags(address, container);
    }

    public StdVideoAV1ColorConfigFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean mono_chrome() {
        return nmono_chrome(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean color_range() {
        return ncolor_range(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean separate_uv_delta_q() {
        return nseparate_uv_delta_q(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean color_description_present_flag() {
        return ncolor_description_present_flag(address()) != 0;
    }

    public StdVideoAV1ColorConfigFlags mono_chrome(@NativeType("uint32_t") boolean value) {
        nmono_chrome(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1ColorConfigFlags color_range(@NativeType("uint32_t") boolean value) {
        ncolor_range(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1ColorConfigFlags separate_uv_delta_q(@NativeType("uint32_t") boolean value) {
        nseparate_uv_delta_q(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1ColorConfigFlags color_description_present_flag(@NativeType("uint32_t") boolean value) {
        ncolor_description_present_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoAV1ColorConfigFlags set(boolean mono_chrome, boolean color_range, boolean separate_uv_delta_q, boolean color_description_present_flag) {
        mono_chrome(mono_chrome);
        color_range(color_range);
        separate_uv_delta_q(separate_uv_delta_q);
        color_description_present_flag(color_description_present_flag);
        return this;
    }

    public StdVideoAV1ColorConfigFlags set(StdVideoAV1ColorConfigFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoAV1ColorConfigFlags malloc() {
        return new StdVideoAV1ColorConfigFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoAV1ColorConfigFlags calloc() {
        return new StdVideoAV1ColorConfigFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoAV1ColorConfigFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1ColorConfigFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoAV1ColorConfigFlags create(long address) {
        return new StdVideoAV1ColorConfigFlags(address, null);
    }

    public static StdVideoAV1ColorConfigFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoAV1ColorConfigFlags(address, null);
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

    public static StdVideoAV1ColorConfigFlags malloc(MemoryStack stack) {
        return new StdVideoAV1ColorConfigFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoAV1ColorConfigFlags calloc(MemoryStack stack) {
        return new StdVideoAV1ColorConfigFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmono_chrome(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int ncolor_range(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int nseparate_uv_delta_q(long struct) {
        return (nbitfield0(struct) & 4) >>> 2;
    }

    public static int ncolor_description_present_flag(long struct) {
        return (nbitfield0(struct) & 8) >>> 3;
    }

    public static int nbitfield1(long struct) {
        return MemoryUtil.memGetInt(struct + BITFIELD1);
    }

    public static int nreserved(long struct) {
        return nbitfield1(struct) & 268435455;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void nmono_chrome(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void ncolor_range(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void nseparate_uv_delta_q(long struct, int value) {
        nbitfield0(struct, ((value << 2) & 4) | (nbitfield0(struct) & (-5)));
    }

    public static void ncolor_description_present_flag(long struct, int value) {
        nbitfield0(struct, ((value << 3) & 8) | (nbitfield0(struct) & (-9)));
    }

    public static void nbitfield1(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD1, value);
    }

    public static void nreserved(long struct, int value) {
        nbitfield1(struct, (nbitfield1(struct) & (-268435456)) | (value & 268435455));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1ColorConfigFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoAV1ColorConfigFlags, Buffer> implements NativeResource {
        private static final StdVideoAV1ColorConfigFlags ELEMENT_FACTORY = StdVideoAV1ColorConfigFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoAV1ColorConfigFlags.SIZEOF);
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
        public StdVideoAV1ColorConfigFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean mono_chrome() {
            return StdVideoAV1ColorConfigFlags.nmono_chrome(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean color_range() {
            return StdVideoAV1ColorConfigFlags.ncolor_range(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean separate_uv_delta_q() {
            return StdVideoAV1ColorConfigFlags.nseparate_uv_delta_q(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean color_description_present_flag() {
            return StdVideoAV1ColorConfigFlags.ncolor_description_present_flag(address()) != 0;
        }

        public Buffer mono_chrome(@NativeType("uint32_t") boolean value) {
            StdVideoAV1ColorConfigFlags.nmono_chrome(address(), value ? 1 : 0);
            return this;
        }

        public Buffer color_range(@NativeType("uint32_t") boolean value) {
            StdVideoAV1ColorConfigFlags.ncolor_range(address(), value ? 1 : 0);
            return this;
        }

        public Buffer separate_uv_delta_q(@NativeType("uint32_t") boolean value) {
            StdVideoAV1ColorConfigFlags.nseparate_uv_delta_q(address(), value ? 1 : 0);
            return this;
        }

        public Buffer color_description_present_flag(@NativeType("uint32_t") boolean value) {
            StdVideoAV1ColorConfigFlags.ncolor_description_present_flag(address(), value ? 1 : 0);
            return this;
        }
    }
}
