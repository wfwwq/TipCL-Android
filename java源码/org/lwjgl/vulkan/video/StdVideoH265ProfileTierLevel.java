package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265ProfileTierLevel.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265ProfileTierLevel.class */
public class StdVideoH265ProfileTierLevel extends Struct<StdVideoH265ProfileTierLevel> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int GENERAL_PROFILE_IDC;
    public static final int GENERAL_LEVEL_IDC;

    static {
        Struct.Layout layout = __struct(__member(StdVideoH265ProfileTierLevelFlags.SIZEOF, StdVideoH265ProfileTierLevelFlags.ALIGNOF), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        GENERAL_PROFILE_IDC = layout.offsetof(1);
        GENERAL_LEVEL_IDC = layout.offsetof(2);
    }

    protected StdVideoH265ProfileTierLevel(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH265ProfileTierLevel create(long address, ByteBuffer container) {
        return new StdVideoH265ProfileTierLevel(address, container);
    }

    public StdVideoH265ProfileTierLevel(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoH265ProfileTierLevelFlags flags() {
        return nflags(address());
    }

    @NativeType("StdVideoH265ProfileIdc")
    public int general_profile_idc() {
        return ngeneral_profile_idc(address());
    }

    @NativeType("StdVideoH265LevelIdc")
    public int general_level_idc() {
        return ngeneral_level_idc(address());
    }

    public StdVideoH265ProfileTierLevel flags(StdVideoH265ProfileTierLevelFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoH265ProfileTierLevel flags(Consumer<StdVideoH265ProfileTierLevelFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoH265ProfileTierLevel general_profile_idc(@NativeType("StdVideoH265ProfileIdc") int value) {
        ngeneral_profile_idc(address(), value);
        return this;
    }

    public StdVideoH265ProfileTierLevel general_level_idc(@NativeType("StdVideoH265LevelIdc") int value) {
        ngeneral_level_idc(address(), value);
        return this;
    }

    public StdVideoH265ProfileTierLevel set(StdVideoH265ProfileTierLevelFlags flags, int general_profile_idc, int general_level_idc) {
        flags(flags);
        general_profile_idc(general_profile_idc);
        general_level_idc(general_level_idc);
        return this;
    }

    public StdVideoH265ProfileTierLevel set(StdVideoH265ProfileTierLevel src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH265ProfileTierLevel malloc() {
        return new StdVideoH265ProfileTierLevel(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH265ProfileTierLevel calloc() {
        return new StdVideoH265ProfileTierLevel(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH265ProfileTierLevel create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265ProfileTierLevel(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH265ProfileTierLevel create(long address) {
        return new StdVideoH265ProfileTierLevel(address, null);
    }

    public static StdVideoH265ProfileTierLevel createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH265ProfileTierLevel(address, null);
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

    public static StdVideoH265ProfileTierLevel malloc(MemoryStack stack) {
        return new StdVideoH265ProfileTierLevel(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH265ProfileTierLevel calloc(MemoryStack stack) {
        return new StdVideoH265ProfileTierLevel(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoH265ProfileTierLevelFlags nflags(long struct) {
        return StdVideoH265ProfileTierLevelFlags.create(struct + FLAGS);
    }

    public static int ngeneral_profile_idc(long struct) {
        return MemoryUtil.memGetInt(struct + GENERAL_PROFILE_IDC);
    }

    public static int ngeneral_level_idc(long struct) {
        return MemoryUtil.memGetInt(struct + GENERAL_LEVEL_IDC);
    }

    public static void nflags(long struct, StdVideoH265ProfileTierLevelFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoH265ProfileTierLevelFlags.SIZEOF);
    }

    public static void ngeneral_profile_idc(long struct, int value) {
        MemoryUtil.memPutInt(struct + GENERAL_PROFILE_IDC, value);
    }

    public static void ngeneral_level_idc(long struct, int value) {
        MemoryUtil.memPutInt(struct + GENERAL_LEVEL_IDC, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265ProfileTierLevel$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265ProfileTierLevel$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH265ProfileTierLevel, Buffer> implements NativeResource {
        private static final StdVideoH265ProfileTierLevel ELEMENT_FACTORY = StdVideoH265ProfileTierLevel.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH265ProfileTierLevel.SIZEOF);
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
        public StdVideoH265ProfileTierLevel getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoH265ProfileTierLevelFlags flags() {
            return StdVideoH265ProfileTierLevel.nflags(address());
        }

        @NativeType("StdVideoH265ProfileIdc")
        public int general_profile_idc() {
            return StdVideoH265ProfileTierLevel.ngeneral_profile_idc(address());
        }

        @NativeType("StdVideoH265LevelIdc")
        public int general_level_idc() {
            return StdVideoH265ProfileTierLevel.ngeneral_level_idc(address());
        }

        public Buffer flags(StdVideoH265ProfileTierLevelFlags value) {
            StdVideoH265ProfileTierLevel.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoH265ProfileTierLevelFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer general_profile_idc(@NativeType("StdVideoH265ProfileIdc") int value) {
            StdVideoH265ProfileTierLevel.ngeneral_profile_idc(address(), value);
            return this;
        }

        public Buffer general_level_idc(@NativeType("StdVideoH265LevelIdc") int value) {
            StdVideoH265ProfileTierLevel.ngeneral_level_idc(address(), value);
            return this;
        }
    }
}
