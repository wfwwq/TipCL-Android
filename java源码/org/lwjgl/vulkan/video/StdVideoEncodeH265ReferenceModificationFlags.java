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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265ReferenceModificationFlags.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265ReferenceModificationFlags.class */
public class StdVideoEncodeH265ReferenceModificationFlags extends Struct<StdVideoEncodeH265ReferenceModificationFlags> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BITFIELD0;

    static {
        Struct.Layout layout = __struct(__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BITFIELD0 = layout.offsetof(0);
    }

    protected StdVideoEncodeH265ReferenceModificationFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeH265ReferenceModificationFlags create(long address, ByteBuffer container) {
        return new StdVideoEncodeH265ReferenceModificationFlags(address, container);
    }

    public StdVideoEncodeH265ReferenceModificationFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean ref_pic_list_modification_flag_l0() {
        return nref_pic_list_modification_flag_l0(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean ref_pic_list_modification_flag_l1() {
        return nref_pic_list_modification_flag_l1(address()) != 0;
    }

    public StdVideoEncodeH265ReferenceModificationFlags ref_pic_list_modification_flag_l0(@NativeType("uint32_t") boolean value) {
        nref_pic_list_modification_flag_l0(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265ReferenceModificationFlags ref_pic_list_modification_flag_l1(@NativeType("uint32_t") boolean value) {
        nref_pic_list_modification_flag_l1(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoEncodeH265ReferenceModificationFlags set(boolean ref_pic_list_modification_flag_l0, boolean ref_pic_list_modification_flag_l1) {
        ref_pic_list_modification_flag_l0(ref_pic_list_modification_flag_l0);
        ref_pic_list_modification_flag_l1(ref_pic_list_modification_flag_l1);
        return this;
    }

    public StdVideoEncodeH265ReferenceModificationFlags set(StdVideoEncodeH265ReferenceModificationFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeH265ReferenceModificationFlags malloc() {
        return new StdVideoEncodeH265ReferenceModificationFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeH265ReferenceModificationFlags calloc() {
        return new StdVideoEncodeH265ReferenceModificationFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeH265ReferenceModificationFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH265ReferenceModificationFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeH265ReferenceModificationFlags create(long address) {
        return new StdVideoEncodeH265ReferenceModificationFlags(address, null);
    }

    public static StdVideoEncodeH265ReferenceModificationFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeH265ReferenceModificationFlags(address, null);
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

    public static StdVideoEncodeH265ReferenceModificationFlags malloc(MemoryStack stack) {
        return new StdVideoEncodeH265ReferenceModificationFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeH265ReferenceModificationFlags calloc(MemoryStack stack) {
        return new StdVideoEncodeH265ReferenceModificationFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nref_pic_list_modification_flag_l0(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int nref_pic_list_modification_flag_l1(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int nreserved(long struct) {
        return nbitfield0(struct) >>> 2;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void nref_pic_list_modification_flag_l0(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void nref_pic_list_modification_flag_l1(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void nreserved(long struct, int value) {
        nbitfield0(struct, (value << 2) | (nbitfield0(struct) & 3));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265ReferenceModificationFlags$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265ReferenceModificationFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265ReferenceModificationFlags, Buffer> implements NativeResource {
        private static final StdVideoEncodeH265ReferenceModificationFlags ELEMENT_FACTORY = StdVideoEncodeH265ReferenceModificationFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeH265ReferenceModificationFlags.SIZEOF);
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
        public StdVideoEncodeH265ReferenceModificationFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean ref_pic_list_modification_flag_l0() {
            return StdVideoEncodeH265ReferenceModificationFlags.nref_pic_list_modification_flag_l0(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean ref_pic_list_modification_flag_l1() {
            return StdVideoEncodeH265ReferenceModificationFlags.nref_pic_list_modification_flag_l1(address()) != 0;
        }

        public Buffer ref_pic_list_modification_flag_l0(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265ReferenceModificationFlags.nref_pic_list_modification_flag_l0(address(), value ? 1 : 0);
            return this;
        }

        public Buffer ref_pic_list_modification_flag_l1(@NativeType("uint32_t") boolean value) {
            StdVideoEncodeH265ReferenceModificationFlags.nref_pic_list_modification_flag_l1(address(), value ? 1 : 0);
            return this;
        }
    }
}
