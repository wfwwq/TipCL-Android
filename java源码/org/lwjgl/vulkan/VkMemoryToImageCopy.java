package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryToImageCopy.class */
public class VkMemoryToImageCopy extends Struct<VkMemoryToImageCopy> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PHOSTPOINTER;
    public static final int MEMORYROWLENGTH;
    public static final int MEMORYIMAGEHEIGHT;
    public static final int IMAGESUBRESOURCE;
    public static final int IMAGEOFFSET;
    public static final int IMAGEEXTENT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(4), __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF), __member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF), __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PHOSTPOINTER = layout.offsetof(2);
        MEMORYROWLENGTH = layout.offsetof(3);
        MEMORYIMAGEHEIGHT = layout.offsetof(4);
        IMAGESUBRESOURCE = layout.offsetof(5);
        IMAGEOFFSET = layout.offsetof(6);
        IMAGEEXTENT = layout.offsetof(7);
    }

    protected VkMemoryToImageCopy(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMemoryToImageCopy create(long address, ByteBuffer container) {
        return new VkMemoryToImageCopy(address, container);
    }

    public VkMemoryToImageCopy(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkStructureType")
    public int sType() {
        return nsType(address());
    }

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("void const *")
    public long pHostPointer() {
        return npHostPointer(address());
    }

    @NativeType("uint32_t")
    public int memoryRowLength() {
        return nmemoryRowLength(address());
    }

    @NativeType("uint32_t")
    public int memoryImageHeight() {
        return nmemoryImageHeight(address());
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

    public VkMemoryToImageCopy sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkMemoryToImageCopy sType$Default() {
        return sType(1000270002);
    }

    public VkMemoryToImageCopy pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkMemoryToImageCopy pHostPointer(@NativeType("void const *") long value) {
        npHostPointer(address(), value);
        return this;
    }

    public VkMemoryToImageCopy memoryRowLength(@NativeType("uint32_t") int value) {
        nmemoryRowLength(address(), value);
        return this;
    }

    public VkMemoryToImageCopy memoryImageHeight(@NativeType("uint32_t") int value) {
        nmemoryImageHeight(address(), value);
        return this;
    }

    public VkMemoryToImageCopy imageSubresource(VkImageSubresourceLayers value) {
        nimageSubresource(address(), value);
        return this;
    }

    public VkMemoryToImageCopy imageSubresource(Consumer<VkImageSubresourceLayers> consumer) {
        consumer.accept(imageSubresource());
        return this;
    }

    public VkMemoryToImageCopy imageOffset(VkOffset3D value) {
        nimageOffset(address(), value);
        return this;
    }

    public VkMemoryToImageCopy imageOffset(Consumer<VkOffset3D> consumer) {
        consumer.accept(imageOffset());
        return this;
    }

    public VkMemoryToImageCopy imageExtent(VkExtent3D value) {
        nimageExtent(address(), value);
        return this;
    }

    public VkMemoryToImageCopy imageExtent(Consumer<VkExtent3D> consumer) {
        consumer.accept(imageExtent());
        return this;
    }

    public VkMemoryToImageCopy set(int sType, long pNext, long pHostPointer, int memoryRowLength, int memoryImageHeight, VkImageSubresourceLayers imageSubresource, VkOffset3D imageOffset, VkExtent3D imageExtent) {
        sType(sType);
        pNext(pNext);
        pHostPointer(pHostPointer);
        memoryRowLength(memoryRowLength);
        memoryImageHeight(memoryImageHeight);
        imageSubresource(imageSubresource);
        imageOffset(imageOffset);
        imageExtent(imageExtent);
        return this;
    }

    public VkMemoryToImageCopy set(VkMemoryToImageCopy src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMemoryToImageCopy malloc() {
        return new VkMemoryToImageCopy(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMemoryToImageCopy calloc() {
        return new VkMemoryToImageCopy(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMemoryToImageCopy create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryToImageCopy(MemoryUtil.memAddress(container), container);
    }

    public static VkMemoryToImageCopy create(long address) {
        return new VkMemoryToImageCopy(address, null);
    }

    public static VkMemoryToImageCopy createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMemoryToImageCopy(address, null);
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

    public static VkMemoryToImageCopy malloc(MemoryStack stack) {
        return new VkMemoryToImageCopy(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMemoryToImageCopy calloc(MemoryStack stack) {
        return new VkMemoryToImageCopy(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return MemoryUtil.memGetInt(struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static long npHostPointer(long struct) {
        return MemoryUtil.memGetAddress(struct + PHOSTPOINTER);
    }

    public static int nmemoryRowLength(long struct) {
        return MemoryUtil.memGetInt(struct + MEMORYROWLENGTH);
    }

    public static int nmemoryImageHeight(long struct) {
        return MemoryUtil.memGetInt(struct + MEMORYIMAGEHEIGHT);
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

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npHostPointer(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PHOSTPOINTER, Checks.check(value));
    }

    public static void nmemoryRowLength(long struct, int value) {
        MemoryUtil.memPutInt(struct + MEMORYROWLENGTH, value);
    }

    public static void nmemoryImageHeight(long struct, int value) {
        MemoryUtil.memPutInt(struct + MEMORYIMAGEHEIGHT, value);
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

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PHOSTPOINTER));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryToImageCopy$Buffer.class */
    public static class Buffer extends StructBuffer<VkMemoryToImageCopy, Buffer> implements NativeResource {
        private static final VkMemoryToImageCopy ELEMENT_FACTORY = VkMemoryToImageCopy.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMemoryToImageCopy.SIZEOF);
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
        public VkMemoryToImageCopy getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkMemoryToImageCopy.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkMemoryToImageCopy.npNext(address());
        }

        @NativeType("void const *")
        public long pHostPointer() {
            return VkMemoryToImageCopy.npHostPointer(address());
        }

        @NativeType("uint32_t")
        public int memoryRowLength() {
            return VkMemoryToImageCopy.nmemoryRowLength(address());
        }

        @NativeType("uint32_t")
        public int memoryImageHeight() {
            return VkMemoryToImageCopy.nmemoryImageHeight(address());
        }

        public VkImageSubresourceLayers imageSubresource() {
            return VkMemoryToImageCopy.nimageSubresource(address());
        }

        public VkOffset3D imageOffset() {
            return VkMemoryToImageCopy.nimageOffset(address());
        }

        public VkExtent3D imageExtent() {
            return VkMemoryToImageCopy.nimageExtent(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMemoryToImageCopy.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000270002);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkMemoryToImageCopy.npNext(address(), value);
            return this;
        }

        public Buffer pHostPointer(@NativeType("void const *") long value) {
            VkMemoryToImageCopy.npHostPointer(address(), value);
            return this;
        }

        public Buffer memoryRowLength(@NativeType("uint32_t") int value) {
            VkMemoryToImageCopy.nmemoryRowLength(address(), value);
            return this;
        }

        public Buffer memoryImageHeight(@NativeType("uint32_t") int value) {
            VkMemoryToImageCopy.nmemoryImageHeight(address(), value);
            return this;
        }

        public Buffer imageSubresource(VkImageSubresourceLayers value) {
            VkMemoryToImageCopy.nimageSubresource(address(), value);
            return this;
        }

        public Buffer imageSubresource(Consumer<VkImageSubresourceLayers> consumer) {
            consumer.accept(imageSubresource());
            return this;
        }

        public Buffer imageOffset(VkOffset3D value) {
            VkMemoryToImageCopy.nimageOffset(address(), value);
            return this;
        }

        public Buffer imageOffset(Consumer<VkOffset3D> consumer) {
            consumer.accept(imageOffset());
            return this;
        }

        public Buffer imageExtent(VkExtent3D value) {
            VkMemoryToImageCopy.nimageExtent(address(), value);
            return this;
        }

        public Buffer imageExtent(Consumer<VkExtent3D> consumer) {
            consumer.accept(imageExtent());
            return this;
        }
    }
}
