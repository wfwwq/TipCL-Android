package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeAV1QIndexKHR.class */
public class VkVideoEncodeAV1QIndexKHR extends Struct<VkVideoEncodeAV1QIndexKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int INTRAQINDEX;
    public static final int PREDICTIVEQINDEX;
    public static final int BIPREDICTIVEQINDEX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        INTRAQINDEX = layout.offsetof(0);
        PREDICTIVEQINDEX = layout.offsetof(1);
        BIPREDICTIVEQINDEX = layout.offsetof(2);
    }

    protected VkVideoEncodeAV1QIndexKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeAV1QIndexKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeAV1QIndexKHR(address, container);
    }

    public VkVideoEncodeAV1QIndexKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int intraQIndex() {
        return nintraQIndex(address());
    }

    @NativeType("uint32_t")
    public int predictiveQIndex() {
        return npredictiveQIndex(address());
    }

    @NativeType("uint32_t")
    public int bipredictiveQIndex() {
        return nbipredictiveQIndex(address());
    }

    public VkVideoEncodeAV1QIndexKHR intraQIndex(@NativeType("uint32_t") int value) {
        nintraQIndex(address(), value);
        return this;
    }

    public VkVideoEncodeAV1QIndexKHR predictiveQIndex(@NativeType("uint32_t") int value) {
        npredictiveQIndex(address(), value);
        return this;
    }

    public VkVideoEncodeAV1QIndexKHR bipredictiveQIndex(@NativeType("uint32_t") int value) {
        nbipredictiveQIndex(address(), value);
        return this;
    }

    public VkVideoEncodeAV1QIndexKHR set(int intraQIndex, int predictiveQIndex, int bipredictiveQIndex) {
        intraQIndex(intraQIndex);
        predictiveQIndex(predictiveQIndex);
        bipredictiveQIndex(bipredictiveQIndex);
        return this;
    }

    public VkVideoEncodeAV1QIndexKHR set(VkVideoEncodeAV1QIndexKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeAV1QIndexKHR malloc() {
        return new VkVideoEncodeAV1QIndexKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeAV1QIndexKHR calloc() {
        return new VkVideoEncodeAV1QIndexKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeAV1QIndexKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1QIndexKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeAV1QIndexKHR create(long address) {
        return new VkVideoEncodeAV1QIndexKHR(address, null);
    }

    public static VkVideoEncodeAV1QIndexKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeAV1QIndexKHR(address, null);
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

    public static VkVideoEncodeAV1QIndexKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1QIndexKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeAV1QIndexKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1QIndexKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nintraQIndex(long struct) {
        return MemoryUtil.memGetInt(struct + INTRAQINDEX);
    }

    public static int npredictiveQIndex(long struct) {
        return MemoryUtil.memGetInt(struct + PREDICTIVEQINDEX);
    }

    public static int nbipredictiveQIndex(long struct) {
        return MemoryUtil.memGetInt(struct + BIPREDICTIVEQINDEX);
    }

    public static void nintraQIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + INTRAQINDEX, value);
    }

    public static void npredictiveQIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + PREDICTIVEQINDEX, value);
    }

    public static void nbipredictiveQIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + BIPREDICTIVEQINDEX, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeAV1QIndexKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1QIndexKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeAV1QIndexKHR ELEMENT_FACTORY = VkVideoEncodeAV1QIndexKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeAV1QIndexKHR.SIZEOF);
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
        public VkVideoEncodeAV1QIndexKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int intraQIndex() {
            return VkVideoEncodeAV1QIndexKHR.nintraQIndex(address());
        }

        @NativeType("uint32_t")
        public int predictiveQIndex() {
            return VkVideoEncodeAV1QIndexKHR.npredictiveQIndex(address());
        }

        @NativeType("uint32_t")
        public int bipredictiveQIndex() {
            return VkVideoEncodeAV1QIndexKHR.nbipredictiveQIndex(address());
        }

        public Buffer intraQIndex(@NativeType("uint32_t") int value) {
            VkVideoEncodeAV1QIndexKHR.nintraQIndex(address(), value);
            return this;
        }

        public Buffer predictiveQIndex(@NativeType("uint32_t") int value) {
            VkVideoEncodeAV1QIndexKHR.npredictiveQIndex(address(), value);
            return this;
        }

        public Buffer bipredictiveQIndex(@NativeType("uint32_t") int value) {
            VkVideoEncodeAV1QIndexKHR.nbipredictiveQIndex(address(), value);
            return this;
        }
    }
}
