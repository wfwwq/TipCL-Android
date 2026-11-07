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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseImageFormatProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseImageFormatProperties.class */
public class VkSparseImageFormatProperties extends Struct<VkSparseImageFormatProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ASPECTMASK;
    public static final int IMAGEGRANULARITY;
    public static final int FLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ASPECTMASK = layout.offsetof(0);
        IMAGEGRANULARITY = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
    }

    protected VkSparseImageFormatProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSparseImageFormatProperties create(long address, ByteBuffer container) {
        return new VkSparseImageFormatProperties(address, container);
    }

    public VkSparseImageFormatProperties(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkImageAspectFlags")
    public int aspectMask() {
        return naspectMask(address());
    }

    public VkExtent3D imageGranularity() {
        return nimageGranularity(address());
    }

    @NativeType("VkSparseImageFormatFlags")
    public int flags() {
        return nflags(address());
    }

    public static VkSparseImageFormatProperties malloc() {
        return new VkSparseImageFormatProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSparseImageFormatProperties calloc() {
        return new VkSparseImageFormatProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSparseImageFormatProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSparseImageFormatProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkSparseImageFormatProperties create(long address) {
        return new VkSparseImageFormatProperties(address, null);
    }

    public static VkSparseImageFormatProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSparseImageFormatProperties(address, null);
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

    public static VkSparseImageFormatProperties malloc(MemoryStack stack) {
        return new VkSparseImageFormatProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSparseImageFormatProperties calloc(MemoryStack stack) {
        return new VkSparseImageFormatProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int naspectMask(long struct) {
        return MemoryUtil.memGetInt(struct + ASPECTMASK);
    }

    public static VkExtent3D nimageGranularity(long struct) {
        return VkExtent3D.create(struct + IMAGEGRANULARITY);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseImageFormatProperties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseImageFormatProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkSparseImageFormatProperties, Buffer> implements NativeResource {
        private static final VkSparseImageFormatProperties ELEMENT_FACTORY = VkSparseImageFormatProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSparseImageFormatProperties.SIZEOF);
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
        public VkSparseImageFormatProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkImageAspectFlags")
        public int aspectMask() {
            return VkSparseImageFormatProperties.naspectMask(address());
        }

        public VkExtent3D imageGranularity() {
            return VkSparseImageFormatProperties.nimageGranularity(address());
        }

        @NativeType("VkSparseImageFormatFlags")
        public int flags() {
            return VkSparseImageFormatProperties.nflags(address());
        }
    }
}
