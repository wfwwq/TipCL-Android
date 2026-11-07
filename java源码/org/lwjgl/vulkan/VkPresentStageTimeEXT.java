package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentStageTimeEXT.class */
public class VkPresentStageTimeEXT extends Struct<VkPresentStageTimeEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STAGE;
    public static final int TIME;

    static {
        Struct.Layout layout = __struct(__member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STAGE = layout.offsetof(0);
        TIME = layout.offsetof(1);
    }

    protected VkPresentStageTimeEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPresentStageTimeEXT create(long address, ByteBuffer container) {
        return new VkPresentStageTimeEXT(address, container);
    }

    public VkPresentStageTimeEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkPresentStageFlagsEXT")
    public int stage() {
        return nstage(address());
    }

    @NativeType("uint64_t")
    public long time() {
        return ntime(address());
    }

    public static VkPresentStageTimeEXT malloc() {
        return new VkPresentStageTimeEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPresentStageTimeEXT calloc() {
        return new VkPresentStageTimeEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPresentStageTimeEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPresentStageTimeEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPresentStageTimeEXT create(long address) {
        return new VkPresentStageTimeEXT(address, null);
    }

    public static VkPresentStageTimeEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPresentStageTimeEXT(address, null);
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

    public static VkPresentStageTimeEXT malloc(MemoryStack stack) {
        return new VkPresentStageTimeEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPresentStageTimeEXT calloc(MemoryStack stack) {
        return new VkPresentStageTimeEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nstage(long struct) {
        return MemoryUtil.memGetInt(struct + STAGE);
    }

    public static long ntime(long struct) {
        return MemoryUtil.memGetLong(struct + TIME);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentStageTimeEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPresentStageTimeEXT, Buffer> implements NativeResource {
        private static final VkPresentStageTimeEXT ELEMENT_FACTORY = VkPresentStageTimeEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPresentStageTimeEXT.SIZEOF);
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
        public VkPresentStageTimeEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkPresentStageFlagsEXT")
        public int stage() {
            return VkPresentStageTimeEXT.nstage(address());
        }

        @NativeType("uint64_t")
        public long time() {
            return VkPresentStageTimeEXT.ntime(address());
        }
    }
}
