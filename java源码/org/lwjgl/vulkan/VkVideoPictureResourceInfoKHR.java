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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoPictureResourceInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoPictureResourceInfoKHR.class */
public class VkVideoPictureResourceInfoKHR extends Struct<VkVideoPictureResourceInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int CODEDOFFSET;
    public static final int CODEDEXTENT;
    public static final int BASEARRAYLAYER;
    public static final int IMAGEVIEWBINDING;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CODEDOFFSET = layout.offsetof(2);
        CODEDEXTENT = layout.offsetof(3);
        BASEARRAYLAYER = layout.offsetof(4);
        IMAGEVIEWBINDING = layout.offsetof(5);
    }

    protected VkVideoPictureResourceInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoPictureResourceInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoPictureResourceInfoKHR(address, container);
    }

    public VkVideoPictureResourceInfoKHR(ByteBuffer container) {
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

    public VkOffset2D codedOffset() {
        return ncodedOffset(address());
    }

    public VkExtent2D codedExtent() {
        return ncodedExtent(address());
    }

    @NativeType("uint32_t")
    public int baseArrayLayer() {
        return nbaseArrayLayer(address());
    }

    @NativeType("VkImageView")
    public long imageViewBinding() {
        return nimageViewBinding(address());
    }

    public VkVideoPictureResourceInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoPictureResourceInfoKHR sType$Default() {
        return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_INFO_KHR);
    }

    public VkVideoPictureResourceInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoPictureResourceInfoKHR codedOffset(VkOffset2D value) {
        ncodedOffset(address(), value);
        return this;
    }

    public VkVideoPictureResourceInfoKHR codedOffset(Consumer<VkOffset2D> consumer) {
        consumer.accept(codedOffset());
        return this;
    }

    public VkVideoPictureResourceInfoKHR codedExtent(VkExtent2D value) {
        ncodedExtent(address(), value);
        return this;
    }

    public VkVideoPictureResourceInfoKHR codedExtent(Consumer<VkExtent2D> consumer) {
        consumer.accept(codedExtent());
        return this;
    }

    public VkVideoPictureResourceInfoKHR baseArrayLayer(@NativeType("uint32_t") int value) {
        nbaseArrayLayer(address(), value);
        return this;
    }

    public VkVideoPictureResourceInfoKHR imageViewBinding(@NativeType("VkImageView") long value) {
        nimageViewBinding(address(), value);
        return this;
    }

    public VkVideoPictureResourceInfoKHR set(int sType, long pNext, VkOffset2D codedOffset, VkExtent2D codedExtent, int baseArrayLayer, long imageViewBinding) {
        sType(sType);
        pNext(pNext);
        codedOffset(codedOffset);
        codedExtent(codedExtent);
        baseArrayLayer(baseArrayLayer);
        imageViewBinding(imageViewBinding);
        return this;
    }

    public VkVideoPictureResourceInfoKHR set(VkVideoPictureResourceInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoPictureResourceInfoKHR malloc() {
        return new VkVideoPictureResourceInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoPictureResourceInfoKHR calloc() {
        return new VkVideoPictureResourceInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoPictureResourceInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoPictureResourceInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoPictureResourceInfoKHR create(long address) {
        return new VkVideoPictureResourceInfoKHR(address, null);
    }

    public static VkVideoPictureResourceInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoPictureResourceInfoKHR(address, null);
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

    public static VkVideoPictureResourceInfoKHR malloc(MemoryStack stack) {
        return new VkVideoPictureResourceInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoPictureResourceInfoKHR calloc(MemoryStack stack) {
        return new VkVideoPictureResourceInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkOffset2D ncodedOffset(long struct) {
        return VkOffset2D.create(struct + CODEDOFFSET);
    }

    public static VkExtent2D ncodedExtent(long struct) {
        return VkExtent2D.create(struct + CODEDEXTENT);
    }

    public static int nbaseArrayLayer(long struct) {
        return MemoryUtil.memGetInt(struct + BASEARRAYLAYER);
    }

    public static long nimageViewBinding(long struct) {
        return MemoryUtil.memGetLong(struct + IMAGEVIEWBINDING);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncodedOffset(long struct, VkOffset2D value) {
        MemoryUtil.memCopy(value.address(), struct + CODEDOFFSET, VkOffset2D.SIZEOF);
    }

    public static void ncodedExtent(long struct, VkExtent2D value) {
        MemoryUtil.memCopy(value.address(), struct + CODEDEXTENT, VkExtent2D.SIZEOF);
    }

    public static void nbaseArrayLayer(long struct, int value) {
        MemoryUtil.memPutInt(struct + BASEARRAYLAYER, value);
    }

    public static void nimageViewBinding(long struct, long value) {
        MemoryUtil.memPutLong(struct + IMAGEVIEWBINDING, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoPictureResourceInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoPictureResourceInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoPictureResourceInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoPictureResourceInfoKHR ELEMENT_FACTORY = VkVideoPictureResourceInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoPictureResourceInfoKHR.SIZEOF);
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
        public VkVideoPictureResourceInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoPictureResourceInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoPictureResourceInfoKHR.npNext(address());
        }

        public VkOffset2D codedOffset() {
            return VkVideoPictureResourceInfoKHR.ncodedOffset(address());
        }

        public VkExtent2D codedExtent() {
            return VkVideoPictureResourceInfoKHR.ncodedExtent(address());
        }

        @NativeType("uint32_t")
        public int baseArrayLayer() {
            return VkVideoPictureResourceInfoKHR.nbaseArrayLayer(address());
        }

        @NativeType("VkImageView")
        public long imageViewBinding() {
            return VkVideoPictureResourceInfoKHR.nimageViewBinding(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoPictureResourceInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoPictureResourceInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer codedOffset(VkOffset2D value) {
            VkVideoPictureResourceInfoKHR.ncodedOffset(address(), value);
            return this;
        }

        public Buffer codedOffset(Consumer<VkOffset2D> consumer) {
            consumer.accept(codedOffset());
            return this;
        }

        public Buffer codedExtent(VkExtent2D value) {
            VkVideoPictureResourceInfoKHR.ncodedExtent(address(), value);
            return this;
        }

        public Buffer codedExtent(Consumer<VkExtent2D> consumer) {
            consumer.accept(codedExtent());
            return this;
        }

        public Buffer baseArrayLayer(@NativeType("uint32_t") int value) {
            VkVideoPictureResourceInfoKHR.nbaseArrayLayer(address(), value);
            return this;
        }

        public Buffer imageViewBinding(@NativeType("VkImageView") long value) {
            VkVideoPictureResourceInfoKHR.nimageViewBinding(address(), value);
            return this;
        }
    }
}
