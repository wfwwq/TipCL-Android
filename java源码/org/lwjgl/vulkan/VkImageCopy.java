package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageCopy.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageCopy.class */
public class VkImageCopy extends Struct<VkImageCopy> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SRCSUBRESOURCE;
    public static final int SRCOFFSET;
    public static final int DSTSUBRESOURCE;
    public static final int DSTOFFSET;
    public static final int EXTENT;

    static {
        Struct.Layout layout = __struct(__member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF), __member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF), __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF), __member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF), __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SRCSUBRESOURCE = layout.offsetof(0);
        SRCOFFSET = layout.offsetof(1);
        DSTSUBRESOURCE = layout.offsetof(2);
        DSTOFFSET = layout.offsetof(3);
        EXTENT = layout.offsetof(4);
    }

    protected VkImageCopy(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageCopy create(long address, ByteBuffer container) {
        return new VkImageCopy(address, container);
    }

    public VkImageCopy(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public VkImageSubresourceLayers srcSubresource() {
        return nsrcSubresource(address());
    }

    public VkOffset3D srcOffset() {
        return nsrcOffset(address());
    }

    public VkImageSubresourceLayers dstSubresource() {
        return ndstSubresource(address());
    }

    public VkOffset3D dstOffset() {
        return ndstOffset(address());
    }

    public VkExtent3D extent() {
        return nextent(address());
    }

    public VkImageCopy srcSubresource(VkImageSubresourceLayers value) {
        nsrcSubresource(address(), value);
        return this;
    }

    public VkImageCopy srcSubresource(Consumer<VkImageSubresourceLayers> consumer) {
        consumer.accept(srcSubresource());
        return this;
    }

    public VkImageCopy srcOffset(VkOffset3D value) {
        nsrcOffset(address(), value);
        return this;
    }

    public VkImageCopy srcOffset(Consumer<VkOffset3D> consumer) {
        consumer.accept(srcOffset());
        return this;
    }

    public VkImageCopy dstSubresource(VkImageSubresourceLayers value) {
        ndstSubresource(address(), value);
        return this;
    }

    public VkImageCopy dstSubresource(Consumer<VkImageSubresourceLayers> consumer) {
        consumer.accept(dstSubresource());
        return this;
    }

    public VkImageCopy dstOffset(VkOffset3D value) {
        ndstOffset(address(), value);
        return this;
    }

    public VkImageCopy dstOffset(Consumer<VkOffset3D> consumer) {
        consumer.accept(dstOffset());
        return this;
    }

    public VkImageCopy extent(VkExtent3D value) {
        nextent(address(), value);
        return this;
    }

    public VkImageCopy extent(Consumer<VkExtent3D> consumer) {
        consumer.accept(extent());
        return this;
    }

    public VkImageCopy set(VkImageSubresourceLayers srcSubresource, VkOffset3D srcOffset, VkImageSubresourceLayers dstSubresource, VkOffset3D dstOffset, VkExtent3D extent) {
        srcSubresource(srcSubresource);
        srcOffset(srcOffset);
        dstSubresource(dstSubresource);
        dstOffset(dstOffset);
        extent(extent);
        return this;
    }

    public VkImageCopy set(VkImageCopy src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageCopy malloc() {
        return new VkImageCopy(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageCopy calloc() {
        return new VkImageCopy(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageCopy create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageCopy(MemoryUtil.memAddress(container), container);
    }

    public static VkImageCopy create(long address) {
        return new VkImageCopy(address, null);
    }

    public static VkImageCopy createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageCopy(address, null);
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

    public static VkImageCopy malloc(MemoryStack stack) {
        return new VkImageCopy(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageCopy calloc(MemoryStack stack) {
        return new VkImageCopy(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VkImageSubresourceLayers nsrcSubresource(long struct) {
        return VkImageSubresourceLayers.create(struct + SRCSUBRESOURCE);
    }

    public static VkOffset3D nsrcOffset(long struct) {
        return VkOffset3D.create(struct + SRCOFFSET);
    }

    public static VkImageSubresourceLayers ndstSubresource(long struct) {
        return VkImageSubresourceLayers.create(struct + DSTSUBRESOURCE);
    }

    public static VkOffset3D ndstOffset(long struct) {
        return VkOffset3D.create(struct + DSTOFFSET);
    }

    public static VkExtent3D nextent(long struct) {
        return VkExtent3D.create(struct + EXTENT);
    }

    public static void nsrcSubresource(long struct, VkImageSubresourceLayers value) {
        MemoryUtil.memCopy(value.address(), struct + SRCSUBRESOURCE, VkImageSubresourceLayers.SIZEOF);
    }

    public static void nsrcOffset(long struct, VkOffset3D value) {
        MemoryUtil.memCopy(value.address(), struct + SRCOFFSET, VkOffset3D.SIZEOF);
    }

    public static void ndstSubresource(long struct, VkImageSubresourceLayers value) {
        MemoryUtil.memCopy(value.address(), struct + DSTSUBRESOURCE, VkImageSubresourceLayers.SIZEOF);
    }

    public static void ndstOffset(long struct, VkOffset3D value) {
        MemoryUtil.memCopy(value.address(), struct + DSTOFFSET, VkOffset3D.SIZEOF);
    }

    public static void nextent(long struct, VkExtent3D value) {
        MemoryUtil.memCopy(value.address(), struct + EXTENT, VkExtent3D.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageCopy$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageCopy$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageCopy, Buffer> implements NativeResource {
        private static final VkImageCopy ELEMENT_FACTORY = VkImageCopy.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageCopy.SIZEOF);
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
        public VkImageCopy getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public VkImageSubresourceLayers srcSubresource() {
            return VkImageCopy.nsrcSubresource(address());
        }

        public VkOffset3D srcOffset() {
            return VkImageCopy.nsrcOffset(address());
        }

        public VkImageSubresourceLayers dstSubresource() {
            return VkImageCopy.ndstSubresource(address());
        }

        public VkOffset3D dstOffset() {
            return VkImageCopy.ndstOffset(address());
        }

        public VkExtent3D extent() {
            return VkImageCopy.nextent(address());
        }

        public Buffer srcSubresource(VkImageSubresourceLayers value) {
            VkImageCopy.nsrcSubresource(address(), value);
            return this;
        }

        public Buffer srcSubresource(Consumer<VkImageSubresourceLayers> consumer) {
            consumer.accept(srcSubresource());
            return this;
        }

        public Buffer srcOffset(VkOffset3D value) {
            VkImageCopy.nsrcOffset(address(), value);
            return this;
        }

        public Buffer srcOffset(Consumer<VkOffset3D> consumer) {
            consumer.accept(srcOffset());
            return this;
        }

        public Buffer dstSubresource(VkImageSubresourceLayers value) {
            VkImageCopy.ndstSubresource(address(), value);
            return this;
        }

        public Buffer dstSubresource(Consumer<VkImageSubresourceLayers> consumer) {
            consumer.accept(dstSubresource());
            return this;
        }

        public Buffer dstOffset(VkOffset3D value) {
            VkImageCopy.ndstOffset(address(), value);
            return this;
        }

        public Buffer dstOffset(Consumer<VkOffset3D> consumer) {
            consumer.accept(dstOffset());
            return this;
        }

        public Buffer extent(VkExtent3D value) {
            VkImageCopy.nextent(address(), value);
            return this;
        }

        public Buffer extent(Consumer<VkExtent3D> consumer) {
            consumer.accept(extent());
            return this;
        }
    }
}
