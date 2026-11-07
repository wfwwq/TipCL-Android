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

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferImageCopy2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferImageCopy2.class */
public class VkBufferImageCopy2 extends Struct<VkBufferImageCopy2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int BUFFEROFFSET;
    public static final int BUFFERROWLENGTH;
    public static final int BUFFERIMAGEHEIGHT;
    public static final int IMAGESUBRESOURCE;
    public static final int IMAGEOFFSET;
    public static final int IMAGEEXTENT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(4), __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF), __member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF), __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BUFFEROFFSET = layout.offsetof(2);
        BUFFERROWLENGTH = layout.offsetof(3);
        BUFFERIMAGEHEIGHT = layout.offsetof(4);
        IMAGESUBRESOURCE = layout.offsetof(5);
        IMAGEOFFSET = layout.offsetof(6);
        IMAGEEXTENT = layout.offsetof(7);
    }

    protected VkBufferImageCopy2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBufferImageCopy2 create(long address, ByteBuffer container) {
        return new VkBufferImageCopy2(address, container);
    }

    public VkBufferImageCopy2(ByteBuffer container) {
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

    @NativeType("VkDeviceSize")
    public long bufferOffset() {
        return nbufferOffset(address());
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

    public VkBufferImageCopy2 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBufferImageCopy2 sType$Default() {
        return sType(1000337009);
    }

    public VkBufferImageCopy2 pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBufferImageCopy2 pNext(VkCopyCommandTransformInfoQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBufferImageCopy2 bufferOffset(@NativeType("VkDeviceSize") long value) {
        nbufferOffset(address(), value);
        return this;
    }

    public VkBufferImageCopy2 bufferRowLength(@NativeType("uint32_t") int value) {
        nbufferRowLength(address(), value);
        return this;
    }

    public VkBufferImageCopy2 bufferImageHeight(@NativeType("uint32_t") int value) {
        nbufferImageHeight(address(), value);
        return this;
    }

    public VkBufferImageCopy2 imageSubresource(VkImageSubresourceLayers value) {
        nimageSubresource(address(), value);
        return this;
    }

    public VkBufferImageCopy2 imageSubresource(Consumer<VkImageSubresourceLayers> consumer) {
        consumer.accept(imageSubresource());
        return this;
    }

    public VkBufferImageCopy2 imageOffset(VkOffset3D value) {
        nimageOffset(address(), value);
        return this;
    }

    public VkBufferImageCopy2 imageOffset(Consumer<VkOffset3D> consumer) {
        consumer.accept(imageOffset());
        return this;
    }

    public VkBufferImageCopy2 imageExtent(VkExtent3D value) {
        nimageExtent(address(), value);
        return this;
    }

    public VkBufferImageCopy2 imageExtent(Consumer<VkExtent3D> consumer) {
        consumer.accept(imageExtent());
        return this;
    }

    public VkBufferImageCopy2 set(int sType, long pNext, long bufferOffset, int bufferRowLength, int bufferImageHeight, VkImageSubresourceLayers imageSubresource, VkOffset3D imageOffset, VkExtent3D imageExtent) {
        sType(sType);
        pNext(pNext);
        bufferOffset(bufferOffset);
        bufferRowLength(bufferRowLength);
        bufferImageHeight(bufferImageHeight);
        imageSubresource(imageSubresource);
        imageOffset(imageOffset);
        imageExtent(imageExtent);
        return this;
    }

    public VkBufferImageCopy2 set(VkBufferImageCopy2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBufferImageCopy2 malloc() {
        return new VkBufferImageCopy2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBufferImageCopy2 calloc() {
        return new VkBufferImageCopy2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBufferImageCopy2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferImageCopy2(MemoryUtil.memAddress(container), container);
    }

    public static VkBufferImageCopy2 create(long address) {
        return new VkBufferImageCopy2(address, null);
    }

    public static VkBufferImageCopy2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBufferImageCopy2(address, null);
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

    public static VkBufferImageCopy2 malloc(MemoryStack stack) {
        return new VkBufferImageCopy2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBufferImageCopy2 calloc(MemoryStack stack) {
        return new VkBufferImageCopy2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nbufferOffset(long struct) {
        return MemoryUtil.memGetLong(struct + BUFFEROFFSET);
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

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nbufferOffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + BUFFEROFFSET, value);
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

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferImageCopy2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferImageCopy2$Buffer.class */
    public static class Buffer extends StructBuffer<VkBufferImageCopy2, Buffer> implements NativeResource {
        private static final VkBufferImageCopy2 ELEMENT_FACTORY = VkBufferImageCopy2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBufferImageCopy2.SIZEOF);
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
        public VkBufferImageCopy2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBufferImageCopy2.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBufferImageCopy2.npNext(address());
        }

        @NativeType("VkDeviceSize")
        public long bufferOffset() {
            return VkBufferImageCopy2.nbufferOffset(address());
        }

        @NativeType("uint32_t")
        public int bufferRowLength() {
            return VkBufferImageCopy2.nbufferRowLength(address());
        }

        @NativeType("uint32_t")
        public int bufferImageHeight() {
            return VkBufferImageCopy2.nbufferImageHeight(address());
        }

        public VkImageSubresourceLayers imageSubresource() {
            return VkBufferImageCopy2.nimageSubresource(address());
        }

        public VkOffset3D imageOffset() {
            return VkBufferImageCopy2.nimageOffset(address());
        }

        public VkExtent3D imageExtent() {
            return VkBufferImageCopy2.nimageExtent(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBufferImageCopy2.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000337009);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBufferImageCopy2.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkCopyCommandTransformInfoQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer bufferOffset(@NativeType("VkDeviceSize") long value) {
            VkBufferImageCopy2.nbufferOffset(address(), value);
            return this;
        }

        public Buffer bufferRowLength(@NativeType("uint32_t") int value) {
            VkBufferImageCopy2.nbufferRowLength(address(), value);
            return this;
        }

        public Buffer bufferImageHeight(@NativeType("uint32_t") int value) {
            VkBufferImageCopy2.nbufferImageHeight(address(), value);
            return this;
        }

        public Buffer imageSubresource(VkImageSubresourceLayers value) {
            VkBufferImageCopy2.nimageSubresource(address(), value);
            return this;
        }

        public Buffer imageSubresource(Consumer<VkImageSubresourceLayers> consumer) {
            consumer.accept(imageSubresource());
            return this;
        }

        public Buffer imageOffset(VkOffset3D value) {
            VkBufferImageCopy2.nimageOffset(address(), value);
            return this;
        }

        public Buffer imageOffset(Consumer<VkOffset3D> consumer) {
            consumer.accept(imageOffset());
            return this;
        }

        public Buffer imageExtent(VkExtent3D value) {
            VkBufferImageCopy2.nimageExtent(address(), value);
            return this;
        }

        public Buffer imageExtent(Consumer<VkExtent3D> consumer) {
            consumer.accept(imageExtent());
            return this;
        }
    }
}
