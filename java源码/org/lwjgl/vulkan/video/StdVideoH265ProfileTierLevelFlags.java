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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265ProfileTierLevelFlags.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265ProfileTierLevelFlags.class */
public class StdVideoH265ProfileTierLevelFlags extends Struct<StdVideoH265ProfileTierLevelFlags> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BITFIELD0;

    static {
        Struct.Layout layout = __struct(__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BITFIELD0 = layout.offsetof(0);
    }

    protected StdVideoH265ProfileTierLevelFlags(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH265ProfileTierLevelFlags create(long address, ByteBuffer container) {
        return new StdVideoH265ProfileTierLevelFlags(address, container);
    }

    public StdVideoH265ProfileTierLevelFlags(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public boolean general_tier_flag() {
        return ngeneral_tier_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean general_progressive_source_flag() {
        return ngeneral_progressive_source_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean general_interlaced_source_flag() {
        return ngeneral_interlaced_source_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean general_non_packed_constraint_flag() {
        return ngeneral_non_packed_constraint_flag(address()) != 0;
    }

    @NativeType("uint32_t")
    public boolean general_frame_only_constraint_flag() {
        return ngeneral_frame_only_constraint_flag(address()) != 0;
    }

    public StdVideoH265ProfileTierLevelFlags general_tier_flag(@NativeType("uint32_t") boolean value) {
        ngeneral_tier_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265ProfileTierLevelFlags general_progressive_source_flag(@NativeType("uint32_t") boolean value) {
        ngeneral_progressive_source_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265ProfileTierLevelFlags general_interlaced_source_flag(@NativeType("uint32_t") boolean value) {
        ngeneral_interlaced_source_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265ProfileTierLevelFlags general_non_packed_constraint_flag(@NativeType("uint32_t") boolean value) {
        ngeneral_non_packed_constraint_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265ProfileTierLevelFlags general_frame_only_constraint_flag(@NativeType("uint32_t") boolean value) {
        ngeneral_frame_only_constraint_flag(address(), value ? 1 : 0);
        return this;
    }

    public StdVideoH265ProfileTierLevelFlags set(boolean general_tier_flag, boolean general_progressive_source_flag, boolean general_interlaced_source_flag, boolean general_non_packed_constraint_flag, boolean general_frame_only_constraint_flag) {
        general_tier_flag(general_tier_flag);
        general_progressive_source_flag(general_progressive_source_flag);
        general_interlaced_source_flag(general_interlaced_source_flag);
        general_non_packed_constraint_flag(general_non_packed_constraint_flag);
        general_frame_only_constraint_flag(general_frame_only_constraint_flag);
        return this;
    }

    public StdVideoH265ProfileTierLevelFlags set(StdVideoH265ProfileTierLevelFlags src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH265ProfileTierLevelFlags malloc() {
        return new StdVideoH265ProfileTierLevelFlags(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH265ProfileTierLevelFlags calloc() {
        return new StdVideoH265ProfileTierLevelFlags(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH265ProfileTierLevelFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265ProfileTierLevelFlags(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH265ProfileTierLevelFlags create(long address) {
        return new StdVideoH265ProfileTierLevelFlags(address, null);
    }

    public static StdVideoH265ProfileTierLevelFlags createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH265ProfileTierLevelFlags(address, null);
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

    public static StdVideoH265ProfileTierLevelFlags malloc(MemoryStack stack) {
        return new StdVideoH265ProfileTierLevelFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH265ProfileTierLevelFlags calloc(MemoryStack stack) {
        return new StdVideoH265ProfileTierLevelFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ngeneral_tier_flag(long struct) {
        return nbitfield0(struct) & 1;
    }

    public static int ngeneral_progressive_source_flag(long struct) {
        return (nbitfield0(struct) & 2) >>> 1;
    }

    public static int ngeneral_interlaced_source_flag(long struct) {
        return (nbitfield0(struct) & 4) >>> 2;
    }

    public static int ngeneral_non_packed_constraint_flag(long struct) {
        return (nbitfield0(struct) & 8) >>> 3;
    }

    public static int ngeneral_frame_only_constraint_flag(long struct) {
        return (nbitfield0(struct) & 16) >>> 4;
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void ngeneral_tier_flag(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-2)) | (value & 1));
    }

    public static void ngeneral_progressive_source_flag(long struct, int value) {
        nbitfield0(struct, ((value << 1) & 2) | (nbitfield0(struct) & (-3)));
    }

    public static void ngeneral_interlaced_source_flag(long struct, int value) {
        nbitfield0(struct, ((value << 2) & 4) | (nbitfield0(struct) & (-5)));
    }

    public static void ngeneral_non_packed_constraint_flag(long struct, int value) {
        nbitfield0(struct, ((value << 3) & 8) | (nbitfield0(struct) & (-9)));
    }

    public static void ngeneral_frame_only_constraint_flag(long struct, int value) {
        nbitfield0(struct, ((value << 4) & 16) | (nbitfield0(struct) & (-17)));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265ProfileTierLevelFlags$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265ProfileTierLevelFlags$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH265ProfileTierLevelFlags, Buffer> implements NativeResource {
        private static final StdVideoH265ProfileTierLevelFlags ELEMENT_FACTORY = StdVideoH265ProfileTierLevelFlags.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH265ProfileTierLevelFlags.SIZEOF);
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
        public StdVideoH265ProfileTierLevelFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public boolean general_tier_flag() {
            return StdVideoH265ProfileTierLevelFlags.ngeneral_tier_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean general_progressive_source_flag() {
            return StdVideoH265ProfileTierLevelFlags.ngeneral_progressive_source_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean general_interlaced_source_flag() {
            return StdVideoH265ProfileTierLevelFlags.ngeneral_interlaced_source_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean general_non_packed_constraint_flag() {
            return StdVideoH265ProfileTierLevelFlags.ngeneral_non_packed_constraint_flag(address()) != 0;
        }

        @NativeType("uint32_t")
        public boolean general_frame_only_constraint_flag() {
            return StdVideoH265ProfileTierLevelFlags.ngeneral_frame_only_constraint_flag(address()) != 0;
        }

        public Buffer general_tier_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265ProfileTierLevelFlags.ngeneral_tier_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer general_progressive_source_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265ProfileTierLevelFlags.ngeneral_progressive_source_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer general_interlaced_source_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265ProfileTierLevelFlags.ngeneral_interlaced_source_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer general_non_packed_constraint_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265ProfileTierLevelFlags.ngeneral_non_packed_constraint_flag(address(), value ? 1 : 0);
            return this;
        }

        public Buffer general_frame_only_constraint_flag(@NativeType("uint32_t") boolean value) {
            StdVideoH265ProfileTierLevelFlags.ngeneral_frame_only_constraint_flag(address(), value ? 1 : 0);
            return this;
        }
    }
}
