package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1GlobalMotion.class */
public class StdVideoAV1GlobalMotion extends Struct<StdVideoAV1GlobalMotion> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int GMTYPE;
    public static final int GM_PARAMS;

    static {
        Struct.Layout layout = __struct(__array(1, 8), __array(4, 6));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        GMTYPE = layout.offsetof(0);
        GM_PARAMS = layout.offsetof(1);
    }

    protected StdVideoAV1GlobalMotion(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoAV1GlobalMotion create(long address, ByteBuffer container) {
        return new StdVideoAV1GlobalMotion(address, container);
    }

    public StdVideoAV1GlobalMotion(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]")
    public ByteBuffer GmType() {
        return nGmType(address());
    }

    @NativeType("uint8_t")
    public byte GmType(int index) {
        return nGmType(address(), index);
    }

    @NativeType("int32_t[STD_VIDEO_AV1_GLOBAL_MOTION_PARAMS]")
    public IntBuffer gm_params() {
        return ngm_params(address());
    }

    @NativeType("int32_t")
    public int gm_params(int index) {
        return ngm_params(address(), index);
    }

    public StdVideoAV1GlobalMotion GmType(@NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]") ByteBuffer value) {
        nGmType(address(), value);
        return this;
    }

    public StdVideoAV1GlobalMotion GmType(int index, @NativeType("uint8_t") byte value) {
        nGmType(address(), index, value);
        return this;
    }

    public StdVideoAV1GlobalMotion gm_params(@NativeType("int32_t[STD_VIDEO_AV1_GLOBAL_MOTION_PARAMS]") IntBuffer value) {
        ngm_params(address(), value);
        return this;
    }

    public StdVideoAV1GlobalMotion gm_params(int index, @NativeType("int32_t") int value) {
        ngm_params(address(), index, value);
        return this;
    }

    public StdVideoAV1GlobalMotion set(ByteBuffer GmType, IntBuffer gm_params) {
        GmType(GmType);
        gm_params(gm_params);
        return this;
    }

    public StdVideoAV1GlobalMotion set(StdVideoAV1GlobalMotion src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoAV1GlobalMotion malloc() {
        return new StdVideoAV1GlobalMotion(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoAV1GlobalMotion calloc() {
        return new StdVideoAV1GlobalMotion(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoAV1GlobalMotion create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1GlobalMotion(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoAV1GlobalMotion create(long address) {
        return new StdVideoAV1GlobalMotion(address, null);
    }

    public static StdVideoAV1GlobalMotion createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoAV1GlobalMotion(address, null);
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

    public static StdVideoAV1GlobalMotion malloc(MemoryStack stack) {
        return new StdVideoAV1GlobalMotion(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoAV1GlobalMotion calloc(MemoryStack stack) {
        return new StdVideoAV1GlobalMotion(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer nGmType(long struct) {
        return MemoryUtil.memByteBuffer(struct + GMTYPE, 8);
    }

    public static byte nGmType(long struct, int index) {
        return MemoryUtil.memGetByte(struct + GMTYPE + (Checks.check(index, 8) * 1));
    }

    public static IntBuffer ngm_params(long struct) {
        return MemoryUtil.memIntBuffer(struct + GM_PARAMS, 6);
    }

    public static int ngm_params(long struct, int index) {
        return MemoryUtil.memGetInt(struct + GM_PARAMS + (Checks.check(index, 6) * 4));
    }

    public static void nGmType(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 8);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + GMTYPE, value.remaining() * 1);
    }

    public static void nGmType(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + GMTYPE + (Checks.check(index, 8) * 1), value);
    }

    public static void ngm_params(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 6);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + GM_PARAMS, value.remaining() * 4);
    }

    public static void ngm_params(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + GM_PARAMS + (Checks.check(index, 6) * 4), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1GlobalMotion$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoAV1GlobalMotion, Buffer> implements NativeResource {
        private static final StdVideoAV1GlobalMotion ELEMENT_FACTORY = StdVideoAV1GlobalMotion.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoAV1GlobalMotion.SIZEOF);
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
        public StdVideoAV1GlobalMotion getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]")
        public ByteBuffer GmType() {
            return StdVideoAV1GlobalMotion.nGmType(address());
        }

        @NativeType("uint8_t")
        public byte GmType(int index) {
            return StdVideoAV1GlobalMotion.nGmType(address(), index);
        }

        @NativeType("int32_t[STD_VIDEO_AV1_GLOBAL_MOTION_PARAMS]")
        public IntBuffer gm_params() {
            return StdVideoAV1GlobalMotion.ngm_params(address());
        }

        @NativeType("int32_t")
        public int gm_params(int index) {
            return StdVideoAV1GlobalMotion.ngm_params(address(), index);
        }

        public Buffer GmType(@NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]") ByteBuffer value) {
            StdVideoAV1GlobalMotion.nGmType(address(), value);
            return this;
        }

        public Buffer GmType(int index, @NativeType("uint8_t") byte value) {
            StdVideoAV1GlobalMotion.nGmType(address(), index, value);
            return this;
        }

        public Buffer gm_params(@NativeType("int32_t[STD_VIDEO_AV1_GLOBAL_MOTION_PARAMS]") IntBuffer value) {
            StdVideoAV1GlobalMotion.ngm_params(address(), value);
            return this;
        }

        public Buffer gm_params(int index, @NativeType("int32_t") int value) {
            StdVideoAV1GlobalMotion.ngm_params(address(), index, value);
            return this;
        }
    }
}
