package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264ReferenceListsInfoFlags.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264ReferenceListsInfoFlags.class */
public class StdVideoEncodeH264ReferenceListsInfoFlags extends Struct<StdVideoEncodeH264ReferenceListsInfoFlags> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BITFIELD0;

    static {
        Struct.Layout layout = __struct(__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BITFIELD0 = layout.offsetof(0);
    }

    protected StdVideoEncodeH264ReferenceListsInfoFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeH264ReferenceListsInfoFlags create(long address, ByteBuffer container) {
        return new StdVideoEncodeH264ReferenceListsInfoFlags(address, container);
    }

    public StdVideoEncodeH264ReferenceListsInfoFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean ref_pic_list_modification_l0_flag() {
        return nref_pic_list_modification_l0_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean ref_pic_list_modification_l1_flag() {
        return nref_pic_list_modification_l1_flag(address()) != 0;
    }

    public StdVideoEncodeH264ReferenceListsInfoFlags ref_pic_list_modification_l0_flag(@NativeType("uint32_t") boolean value) {
        nref_pic_list_modification_l0_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH264ReferenceListsInfoFlags ref_pic_list_modification_l1_flag(@NativeType("uint32_t") boolean value) {
        nref_pic_list_modification_l1_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH264ReferenceListsInfoFlags set(boolean ref_pic_list_modification_l0_flag, boolean ref_pic_list_modification_l1_flag) {
        ref_pic_list_modification_l0_flag(ref_pic_list_modification_l0_flag);
        ref_pic_list_modification_l1_flag(ref_pic_list_modification_l1_flag);
        return this;
    }

    public StdVideoEncodeH264ReferenceListsInfoFlags set(StdVideoEncodeH264ReferenceListsInfoFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeH264ReferenceListsInfoFlags malloc() {
        return new StdVideoEncodeH264ReferenceListsInfoFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeH264ReferenceListsInfoFlags calloc() {
        return new StdVideoEncodeH264ReferenceListsInfoFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeH264ReferenceListsInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH264ReferenceListsInfoFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeH264ReferenceListsInfoFlags create(long address) {
        return new StdVideoEncodeH264ReferenceListsInfoFlags(address, null);
    }

    public static StdVideoEncodeH264ReferenceListsInfoFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeH264ReferenceListsInfoFlags(address, null);
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

    public static StdVideoEncodeH264ReferenceListsInfoFlags malloc(MemoryStack stack) {
        return new StdVideoEncodeH264ReferenceListsInfoFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeH264ReferenceListsInfoFlags calloc(MemoryStack stack) {
        return new StdVideoEncodeH264ReferenceListsInfoFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nref_pic_list_modification_l0_flag(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int nref_pic_list_modification_l1_flag(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int nreserved(long struct) {
        return nbitfield0(struct) >>> 2;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void nref_pic_list_modification_l0_flag(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void nref_pic_list_modification_l1_flag(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void nreserved(long struct, int value) {
        nbitfield0(struct, (value << 2) | (nbitfield0(struct) & 3));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264ReferenceListsInfoFlags$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264ReferenceListsInfoFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264ReferenceListsInfoFlags, Buffer> implements NativeResource {
        private static final StdVideoEncodeH264ReferenceListsInfoFlags ELEMENT_FACTORY = StdVideoEncodeH264ReferenceListsInfoFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeH264ReferenceListsInfoFlags.SIZEOF);
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
        public StdVideoEncodeH264ReferenceListsInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean ref_pic_list_modification_l0_flag() {
            return StdVideoEncodeH264ReferenceListsInfoFlags.nref_pic_list_modification_l0_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean ref_pic_list_modification_l1_flag() {
            return StdVideoEncodeH264ReferenceListsInfoFlags.nref_pic_list_modification_l1_flag(address()) != 0;
        }

        public Buffer ref_pic_list_modification_l0_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH264ReferenceListsInfoFlags.nref_pic_list_modification_l0_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer ref_pic_list_modification_l1_flag(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH264ReferenceListsInfoFlags.nref_pic_list_modification_l1_flag(address(), value ? 1 : 0);
            return this;
        }
    }
}
