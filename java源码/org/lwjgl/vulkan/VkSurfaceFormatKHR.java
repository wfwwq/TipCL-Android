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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfaceFormatKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfaceFormatKHR.class */
public class VkSurfaceFormatKHR extends Struct<VkSurfaceFormatKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FORMAT;
    public static final int COLORSPACE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FORMAT = layout.offsetof(0);
        COLORSPACE = layout.offsetof(1);
    }

    protected VkSurfaceFormatKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSurfaceFormatKHR create(long address, ByteBuffer container) {
        return new VkSurfaceFormatKHR(address, container);
    }

    public VkSurfaceFormatKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkFormat")
    public int format() {
        return nformat(address());
    }

    @NativeType("VkColorSpaceKHR")
    public int colorSpace() {
        return ncolorSpace(address());
    }

    public static VkSurfaceFormatKHR malloc() {
        return new VkSurfaceFormatKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSurfaceFormatKHR calloc() {
        return new VkSurfaceFormatKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSurfaceFormatKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfaceFormatKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSurfaceFormatKHR create(long address) {
        return new VkSurfaceFormatKHR(address, null);
    }

    public static VkSurfaceFormatKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSurfaceFormatKHR(address, null);
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

    public static VkSurfaceFormatKHR malloc(MemoryStack stack) {
        return new VkSurfaceFormatKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSurfaceFormatKHR calloc(MemoryStack stack) {
        return new VkSurfaceFormatKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static int ncolorSpace(long struct) {
        return MemoryUtil.memGetInt(struct + COLORSPACE);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfaceFormatKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfaceFormatKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkSurfaceFormatKHR, Buffer> implements NativeResource {
        private static final VkSurfaceFormatKHR ELEMENT_FACTORY = VkSurfaceFormatKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSurfaceFormatKHR.SIZEOF);
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
        public VkSurfaceFormatKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkFormat")
        public int format() {
            return VkSurfaceFormatKHR.nformat(address());
        }

        @NativeType("VkColorSpaceKHR")
        public int colorSpace() {
            return VkSurfaceFormatKHR.ncolorSpace(address());
        }
    }
}
