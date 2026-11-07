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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPlanePropertiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPlanePropertiesKHR.class */
public class VkDisplayPlanePropertiesKHR extends Struct<VkDisplayPlanePropertiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int CURRENTDISPLAY;
    public static final int CURRENTSTACKINDEX;

    static {
        Struct.Layout layout = __struct(__member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        CURRENTDISPLAY = layout.offsetof(0);
        CURRENTSTACKINDEX = layout.offsetof(1);
    }

    protected VkDisplayPlanePropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDisplayPlanePropertiesKHR create(long address, ByteBuffer container) {
        return new VkDisplayPlanePropertiesKHR(address, container);
    }

    public VkDisplayPlanePropertiesKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDisplayKHR")
    public long currentDisplay() {
        return ncurrentDisplay(address());
    }

    @NativeType("uint32_t")
    public int currentStackIndex() {
        return ncurrentStackIndex(address());
    }

    public static VkDisplayPlanePropertiesKHR malloc() {
        return new VkDisplayPlanePropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDisplayPlanePropertiesKHR calloc() {
        return new VkDisplayPlanePropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDisplayPlanePropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDisplayPlanePropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDisplayPlanePropertiesKHR create(long address) {
        return new VkDisplayPlanePropertiesKHR(address, null);
    }

    public static VkDisplayPlanePropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDisplayPlanePropertiesKHR(address, null);
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

    public static VkDisplayPlanePropertiesKHR malloc(MemoryStack stack) {
        return new VkDisplayPlanePropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDisplayPlanePropertiesKHR calloc(MemoryStack stack) {
        return new VkDisplayPlanePropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long ncurrentDisplay(long struct) {
        return MemoryUtil.memGetLong(struct + CURRENTDISPLAY);
    }

    public static int ncurrentStackIndex(long struct) {
        return MemoryUtil.memGetInt(struct + CURRENTSTACKINDEX);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPlanePropertiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPlanePropertiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkDisplayPlanePropertiesKHR, Buffer> implements NativeResource {
        private static final VkDisplayPlanePropertiesKHR ELEMENT_FACTORY = VkDisplayPlanePropertiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDisplayPlanePropertiesKHR.SIZEOF);
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
        public VkDisplayPlanePropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDisplayKHR")
        public long currentDisplay() {
            return VkDisplayPlanePropertiesKHR.ncurrentDisplay(address());
        }

        @NativeType("uint32_t")
        public int currentStackIndex() {
            return VkDisplayPlanePropertiesKHR.ncurrentStackIndex(address());
        }
    }
}
