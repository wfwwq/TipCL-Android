package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTraceRaysIndirectCommandKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTraceRaysIndirectCommandKHR.class */
public class VkTraceRaysIndirectCommandKHR extends Struct<VkTraceRaysIndirectCommandKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int WIDTH;
    public static final int HEIGHT;
    public static final int DEPTH;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
        DEPTH = layout.offsetof(2);
    }

    protected VkTraceRaysIndirectCommandKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkTraceRaysIndirectCommandKHR create(long address, ByteBuffer container) {
        return new VkTraceRaysIndirectCommandKHR(address, container);
    }

    public VkTraceRaysIndirectCommandKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int width() {
        return nwidth(address());
    }

    @NativeType("uint32_t")
    public int height() {
        return nheight(address());
    }

    @NativeType("uint32_t")
    public int depth() {
        return ndepth(address());
    }

    public VkTraceRaysIndirectCommandKHR width(@NativeType("uint32_t") int value) {
        nwidth(address(), value);
        return this;
    }

    public VkTraceRaysIndirectCommandKHR height(@NativeType("uint32_t") int value) {
        nheight(address(), value);
        return this;
    }

    public VkTraceRaysIndirectCommandKHR depth(@NativeType("uint32_t") int value) {
        ndepth(address(), value);
        return this;
    }

    public VkTraceRaysIndirectCommandKHR set(int width, int height, int depth) {
        width(width);
        height(height);
        depth(depth);
        return this;
    }

    public VkTraceRaysIndirectCommandKHR set(VkTraceRaysIndirectCommandKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkTraceRaysIndirectCommandKHR malloc() {
        return new VkTraceRaysIndirectCommandKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkTraceRaysIndirectCommandKHR calloc() {
        return new VkTraceRaysIndirectCommandKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkTraceRaysIndirectCommandKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTraceRaysIndirectCommandKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkTraceRaysIndirectCommandKHR create(long address) {
        return new VkTraceRaysIndirectCommandKHR(address, null);
    }

    public static VkTraceRaysIndirectCommandKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkTraceRaysIndirectCommandKHR(address, null);
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

    public static VkTraceRaysIndirectCommandKHR malloc(MemoryStack stack) {
        return new VkTraceRaysIndirectCommandKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkTraceRaysIndirectCommandKHR calloc(MemoryStack stack) {
        return new VkTraceRaysIndirectCommandKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nwidth(long struct) {
        return MemoryUtil.memGetInt(struct + WIDTH);
    }

    public static int nheight(long struct) {
        return MemoryUtil.memGetInt(struct + HEIGHT);
    }

    public static int ndepth(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTH);
    }

    public static void nwidth(long struct, int value) {
        MemoryUtil.memPutInt(struct + WIDTH, value);
    }

    public static void nheight(long struct, int value) {
        MemoryUtil.memPutInt(struct + HEIGHT, value);
    }

    public static void ndepth(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTH, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTraceRaysIndirectCommandKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTraceRaysIndirectCommandKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkTraceRaysIndirectCommandKHR, Buffer> implements NativeResource {
        private static final VkTraceRaysIndirectCommandKHR ELEMENT_FACTORY = VkTraceRaysIndirectCommandKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkTraceRaysIndirectCommandKHR.SIZEOF);
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
        public VkTraceRaysIndirectCommandKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int width() {
            return VkTraceRaysIndirectCommandKHR.nwidth(address());
        }

        @NativeType("uint32_t")
        public int height() {
            return VkTraceRaysIndirectCommandKHR.nheight(address());
        }

        @NativeType("uint32_t")
        public int depth() {
            return VkTraceRaysIndirectCommandKHR.ndepth(address());
        }

        public Buffer width(@NativeType("uint32_t") int value) {
            VkTraceRaysIndirectCommandKHR.nwidth(address(), value);
            return this;
        }

        public Buffer height(@NativeType("uint32_t") int value) {
            VkTraceRaysIndirectCommandKHR.nheight(address(), value);
            return this;
        }

        public Buffer depth(@NativeType("uint32_t") int value) {
            VkTraceRaysIndirectCommandKHR.ndepth(address(), value);
            return this;
        }
    }
}
