package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryToImageIndirectCommandKHR.class */
public class VkCopyMemoryToImageIndirectCommandKHR extends Struct<VkCopyMemoryToImageIndirectCommandKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SRCADDRESS;
    public static final int BUFFERROWLENGTH;
    public static final int BUFFERIMAGEHEIGHT;
    public static final int IMAGESUBRESOURCE;
    public static final int IMAGEOFFSET;
    public static final int IMAGEEXTENT;

    static {
        Struct.Layout layout = __struct(__member(8), __member(4), __member(4), __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF), __member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF), __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SRCADDRESS = layout.offsetof(0);
        BUFFERROWLENGTH = layout.offsetof(1);
        BUFFERIMAGEHEIGHT = layout.offsetof(2);
        IMAGESUBRESOURCE = layout.offsetof(3);
        IMAGEOFFSET = layout.offsetof(4);
        IMAGEEXTENT = layout.offsetof(5);
    }

    protected VkCopyMemoryToImageIndirectCommandKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCopyMemoryToImageIndirectCommandKHR create(long address, ByteBuffer container) {
        return new VkCopyMemoryToImageIndirectCommandKHR(address, container);
    }

    public VkCopyMemoryToImageIndirectCommandKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDeviceAddress")
    public long srcAddress() {
        return nsrcAddress(address());
    }

    @NativeType("uint32_t")
    public int bufferRowLength() {
        return nbufferRowLength(address());
    }

    @NativeType("uint32_t")
    public int bufferImageHeight() {
        return nbufferImageHeight(address());
    }

    public VkImageSubresourceLayers imageSubresource() {
        return nimageSubresource(address());
    }

    public VkOffset3D imageOffset() {
        return nimageOffset(address());
    }

    public VkExtent3D imageExtent() {
        return nimageExtent(address());
    }

    public VkCopyMemoryToImageIndirectCommandKHR srcAddress(@NativeType("VkDeviceAddress") long value) {
        nsrcAddress(address(), value);
        return this;
    }

    public VkCopyMemoryToImageIndirectCommandKHR bufferRowLength(@NativeType("uint32_t") int value) {
        nbufferRowLength(address(), value);
        return this;
    }

    public VkCopyMemoryToImageIndirectCommandKHR bufferImageHeight(@NativeType("uint32_t") int value) {
        nbufferImageHeight(address(), value);
        return this;
    }

    public VkCopyMemoryToImageIndirectCommandKHR imageSubresource(VkImageSubresourceLayers value) {
        nimageSubresource(address(), value);
        return this;
    }

    public VkCopyMemoryToImageIndirectCommandKHR imageSubresource(Consumer<VkImageSubresourceLayers> consumer) {
        consumer.accept(imageSubresource());
        return this;
    }

    public VkCopyMemoryToImageIndirectCommandKHR imageOffset(VkOffset3D value) {
        nimageOffset(address(), value);
        return this;
    }

    public VkCopyMemoryToImageIndirectCommandKHR imageOffset(Consumer<VkOffset3D> consumer) {
        consumer.accept(imageOffset());
        return this;
    }

    public VkCopyMemoryToImageIndirectCommandKHR imageExtent(VkExtent3D value) {
        nimageExtent(address(), value);
        return this;
    }

    public VkCopyMemoryToImageIndirectCommandKHR imageExtent(Consumer<VkExtent3D> consumer) {
        consumer.accept(imageExtent());
        return this;
    }

    public VkCopyMemoryToImageIndirectCommandKHR set(long srcAddress, int bufferRowLength, int bufferImageHeight, VkImageSubresourceLayers imageSubresource, VkOffset3D imageOffset, VkExtent3D imageExtent) {
        srcAddress(srcAddress);
        bufferRowLength(bufferRowLength);
        bufferImageHeight(bufferImageHeight);
        imageSubresource(imageSubresource);
        imageOffset(imageOffset);
        imageExtent(imageExtent);
        return this;
    }

    public VkCopyMemoryToImageIndirectCommandKHR set(VkCopyMemoryToImageIndirectCommandKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCopyMemoryToImageIndirectCommandKHR malloc() {
        return new VkCopyMemoryToImageIndirectCommandKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCopyMemoryToImageIndirectCommandKHR calloc() {
        return new VkCopyMemoryToImageIndirectCommandKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCopyMemoryToImageIndirectCommandKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyMemoryToImageIndirectCommandKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkCopyMemoryToImageIndirectCommandKHR create(long address) {
        return new VkCopyMemoryToImageIndirectCommandKHR(address, null);
    }

    public static VkCopyMemoryToImageIndirectCommandKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCopyMemoryToImageIndirectCommandKHR(address, null);
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

    public static VkCopyMemoryToImageIndirectCommandKHR malloc(MemoryStack stack) {
        return new VkCopyMemoryToImageIndirectCommandKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCopyMemoryToImageIndirectCommandKHR calloc(MemoryStack stack) {
        return new VkCopyMemoryToImageIndirectCommandKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nsrcAddress(long struct) {
        return MemoryUtil.memGetLong(struct + SRCADDRESS);
    }

    public static int nbufferRowLength(long struct) {
        return MemoryUtil.memGetInt(struct + BUFFERROWLENGTH);
    }

    public static int nbufferImageHeight(long struct) {
        return MemoryUtil.memGetInt(struct + BUFFERIMAGEHEIGHT);
    }

    public static VkImageSubresourceLayers nimageSubresource(long struct) {
        return VkImageSubresourceLayers.create(struct + IMAGESUBRESOURCE);
    }

    public static VkOffset3D nimageOffset(long struct) {
        return VkOffset3D.create(struct + IMAGEOFFSET);
    }

    public static VkExtent3D nimageExtent(long struct) {
        return VkExtent3D.create(struct + IMAGEEXTENT);
    }

    public static void nsrcAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRCADDRESS, value);
    }

    public static void nbufferRowLength(long struct, int value) {
        MemoryUtil.memPutInt(struct + BUFFERROWLENGTH, value);
    }

    public static void nbufferImageHeight(long struct, int value) {
        MemoryUtil.memPutInt(struct + BUFFERIMAGEHEIGHT, value);
    }

    public static void nimageSubresource(long struct, VkImageSubresourceLayers value) {
        MemoryUtil.memCopy(value.address(), struct + IMAGESUBRESOURCE, VkImageSubresourceLayers.SIZEOF);
    }

    public static void nimageOffset(long struct, VkOffset3D value) {
        MemoryUtil.memCopy(value.address(), struct + IMAGEOFFSET, VkOffset3D.SIZEOF);
    }

    public static void nimageExtent(long struct, VkExtent3D value) {
        MemoryUtil.memCopy(value.address(), struct + IMAGEEXTENT, VkExtent3D.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryToImageIndirectCommandKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkCopyMemoryToImageIndirectCommandKHR, Buffer> implements NativeResource {
        private static final VkCopyMemoryToImageIndirectCommandKHR ELEMENT_FACTORY = VkCopyMemoryToImageIndirectCommandKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCopyMemoryToImageIndirectCommandKHR.SIZEOF);
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
        public VkCopyMemoryToImageIndirectCommandKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceAddress")
        public long srcAddress() {
            return VkCopyMemoryToImageIndirectCommandKHR.nsrcAddress(address());
        }

        @NativeType("uint32_t")
        public int bufferRowLength() {
            return VkCopyMemoryToImageIndirectCommandKHR.nbufferRowLength(address());
        }

        @NativeType("uint32_t")
        public int bufferImageHeight() {
            return VkCopyMemoryToImageIndirectCommandKHR.nbufferImageHeight(address());
        }

        public VkImageSubresourceLayers imageSubresource() {
            return VkCopyMemoryToImageIndirectCommandKHR.nimageSubresource(address());
        }

        public VkOffset3D imageOffset() {
            return VkCopyMemoryToImageIndirectCommandKHR.nimageOffset(address());
        }

        public VkExtent3D imageExtent() {
            return VkCopyMemoryToImageIndirectCommandKHR.nimageExtent(address());
        }

        public Buffer srcAddress(@NativeType("VkDeviceAddress") long value) {
            VkCopyMemoryToImageIndirectCommandKHR.nsrcAddress(address(), value);
            return this;
        }

        public Buffer bufferRowLength(@NativeType("uint32_t") int value) {
            VkCopyMemoryToImageIndirectCommandKHR.nbufferRowLength(address(), value);
            return this;
        }

        public Buffer bufferImageHeight(@NativeType("uint32_t") int value) {
            VkCopyMemoryToImageIndirectCommandKHR.nbufferImageHeight(address(), value);
            return this;
        }

        public Buffer imageSubresource(VkImageSubresourceLayers value) {
            VkCopyMemoryToImageIndirectCommandKHR.nimageSubresource(address(), value);
            return this;
        }

        public Buffer imageSubresource(Consumer<VkImageSubresourceLayers> consumer) {
            consumer.accept(imageSubresource());
            return this;
        }

        public Buffer imageOffset(VkOffset3D value) {
            VkCopyMemoryToImageIndirectCommandKHR.nimageOffset(address(), value);
            return this;
        }

        public Buffer imageOffset(Consumer<VkOffset3D> consumer) {
            consumer.accept(imageOffset());
            return this;
        }

        public Buffer imageExtent(VkExtent3D value) {
            VkCopyMemoryToImageIndirectCommandKHR.nimageExtent(address(), value);
            return this;
        }

        public Buffer imageExtent(Consumer<VkExtent3D> consumer) {
            consumer.accept(imageExtent());
            return this;
        }
    }
}
