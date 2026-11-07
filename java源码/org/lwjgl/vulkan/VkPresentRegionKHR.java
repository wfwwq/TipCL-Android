package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkRectLayerKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentRegionKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentRegionKHR.class */
public class VkPresentRegionKHR extends Struct<VkPresentRegionKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int RECTANGLECOUNT;
    public static final int PRECTANGLES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        RECTANGLECOUNT = layout.offsetof(0);
        PRECTANGLES = layout.offsetof(1);
    }

    protected VkPresentRegionKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPresentRegionKHR create(long address, ByteBuffer container) {
        return new VkPresentRegionKHR(address, container);
    }

    public VkPresentRegionKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int rectangleCount() {
        return nrectangleCount(address());
    }

    @NativeType("VkRectLayerKHR const *")
    public VkRectLayerKHR.Buffer pRectangles() {
        return npRectangles(address());
    }

    public VkPresentRegionKHR rectangleCount(@NativeType("uint32_t") int value) {
        nrectangleCount(address(), value);
        return this;
    }

    public VkPresentRegionKHR pRectangles(@NativeType("VkRectLayerKHR const *") VkRectLayerKHR.Buffer value) {
        npRectangles(address(), value);
        return this;
    }

    public VkPresentRegionKHR set(int rectangleCount, VkRectLayerKHR.Buffer pRectangles) {
        rectangleCount(rectangleCount);
        pRectangles(pRectangles);
        return this;
    }

    public VkPresentRegionKHR set(VkPresentRegionKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPresentRegionKHR malloc() {
        return new VkPresentRegionKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPresentRegionKHR calloc() {
        return new VkPresentRegionKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPresentRegionKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPresentRegionKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPresentRegionKHR create(long address) {
        return new VkPresentRegionKHR(address, null);
    }

    public static VkPresentRegionKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPresentRegionKHR(address, null);
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

    public static VkPresentRegionKHR malloc(MemoryStack stack) {
        return new VkPresentRegionKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPresentRegionKHR calloc(MemoryStack stack) {
        return new VkPresentRegionKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nrectangleCount(long struct) {
        return MemoryUtil.memGetInt(struct + RECTANGLECOUNT);
    }

    public static VkRectLayerKHR.Buffer npRectangles(long struct) {
        return VkRectLayerKHR.createSafe(MemoryUtil.memGetAddress(struct + PRECTANGLES), nrectangleCount(struct));
    }

    public static void nrectangleCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + RECTANGLECOUNT, value);
    }

    public static void npRectangles(long struct, VkRectLayerKHR.Buffer value) {
        MemoryUtil.memPutAddress(struct + PRECTANGLES, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nrectangleCount(struct, value.remaining());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentRegionKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentRegionKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPresentRegionKHR, Buffer> implements NativeResource {
        private static final VkPresentRegionKHR ELEMENT_FACTORY = VkPresentRegionKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPresentRegionKHR.SIZEOF);
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
        public VkPresentRegionKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int rectangleCount() {
            return VkPresentRegionKHR.nrectangleCount(address());
        }

        @NativeType("VkRectLayerKHR const *")
        public VkRectLayerKHR.Buffer pRectangles() {
            return VkPresentRegionKHR.npRectangles(address());
        }

        public Buffer rectangleCount(@NativeType("uint32_t") int value) {
            VkPresentRegionKHR.nrectangleCount(address(), value);
            return this;
        }

        public Buffer pRectangles(@NativeType("VkRectLayerKHR const *") VkRectLayerKHR.Buffer value) {
            VkPresentRegionKHR.npRectangles(address(), value);
            return this;
        }
    }
}
