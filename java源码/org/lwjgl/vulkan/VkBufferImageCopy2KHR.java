package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkBufferImageCopy2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferImageCopy2KHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferImageCopy2KHR.class */
public class VkBufferImageCopy2KHR extends VkBufferImageCopy2 {
    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public /* bridge */ /* synthetic */ VkBufferImageCopy2 imageExtent(Consumer consumer) {
        return imageExtent((Consumer<VkExtent3D>) consumer);
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public /* bridge */ /* synthetic */ VkBufferImageCopy2 imageOffset(Consumer consumer) {
        return imageOffset((Consumer<VkOffset3D>) consumer);
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public /* bridge */ /* synthetic */ VkBufferImageCopy2 imageSubresource(Consumer consumer) {
        return imageSubresource((Consumer<VkImageSubresourceLayers>) consumer);
    }

    protected VkBufferImageCopy2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkBufferImageCopy2, org.lwjgl.system.Struct
    public VkBufferImageCopy2KHR create(long address, ByteBuffer container) {
        return new VkBufferImageCopy2KHR(address, container);
    }

    public VkBufferImageCopy2KHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public VkBufferImageCopy2KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public VkBufferImageCopy2KHR sType$Default() {
        return sType(1000337009);
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public VkBufferImageCopy2KHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public VkBufferImageCopy2KHR bufferOffset(@NativeType("VkDeviceSize") long value) {
        nbufferOffset(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public VkBufferImageCopy2KHR bufferRowLength(@NativeType("uint32_t") int value) {
        nbufferRowLength(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public VkBufferImageCopy2KHR bufferImageHeight(@NativeType("uint32_t") int value) {
        nbufferImageHeight(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public VkBufferImageCopy2KHR imageSubresource(VkImageSubresourceLayers value) {
        nimageSubresource(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public VkBufferImageCopy2KHR imageSubresource(Consumer<VkImageSubresourceLayers> consumer) {
        consumer.accept(imageSubresource());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public VkBufferImageCopy2KHR imageOffset(VkOffset3D value) {
        nimageOffset(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public VkBufferImageCopy2KHR imageOffset(Consumer<VkOffset3D> consumer) {
        consumer.accept(imageOffset());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public VkBufferImageCopy2KHR imageExtent(VkExtent3D value) {
        nimageExtent(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public VkBufferImageCopy2KHR imageExtent(Consumer<VkExtent3D> consumer) {
        consumer.accept(imageExtent());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public VkBufferImageCopy2KHR set(int sType, long pNext, long bufferOffset, int bufferRowLength, int bufferImageHeight, VkImageSubresourceLayers imageSubresource, VkOffset3D imageOffset, VkExtent3D imageExtent) {
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

    public VkBufferImageCopy2KHR set(VkBufferImageCopy2KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBufferImageCopy2KHR malloc() {
        return new VkBufferImageCopy2KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBufferImageCopy2KHR calloc() {
        return new VkBufferImageCopy2KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBufferImageCopy2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferImageCopy2KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkBufferImageCopy2KHR create(long address) {
        return new VkBufferImageCopy2KHR(address, null);
    }

    public static VkBufferImageCopy2KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBufferImageCopy2KHR(address, null);
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

    public static VkBufferImageCopy2KHR malloc(MemoryStack stack) {
        return new VkBufferImageCopy2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBufferImageCopy2KHR calloc(MemoryStack stack) {
        return new VkBufferImageCopy2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferImageCopy2KHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferImageCopy2KHR$Buffer.class */
    public static class Buffer extends VkBufferImageCopy2.Buffer {
        private static final VkBufferImageCopy2KHR ELEMENT_FACTORY = VkBufferImageCopy2KHR.create(-1L);

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public /* bridge */ /* synthetic */ VkBufferImageCopy2.Buffer imageExtent(Consumer consumer) {
            return imageExtent((Consumer<VkExtent3D>) consumer);
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public /* bridge */ /* synthetic */ VkBufferImageCopy2.Buffer imageOffset(Consumer consumer) {
            return imageOffset((Consumer<VkOffset3D>) consumer);
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public /* bridge */ /* synthetic */ VkBufferImageCopy2.Buffer imageSubresource(Consumer consumer) {
            return imageSubresource((Consumer<VkImageSubresourceLayers>) consumer);
        }

        public Buffer(ByteBuffer container) {
            super(container);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer, org.lwjgl.system.StructBuffer
        public VkBufferImageCopy2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBufferImageCopy2KHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public Buffer sType$Default() {
            return sType(1000337009);
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkBufferImageCopy2KHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public Buffer bufferOffset(@NativeType("VkDeviceSize") long value) {
            VkBufferImageCopy2KHR.nbufferOffset(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public Buffer bufferRowLength(@NativeType("uint32_t") int value) {
            VkBufferImageCopy2KHR.nbufferRowLength(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public Buffer bufferImageHeight(@NativeType("uint32_t") int value) {
            VkBufferImageCopy2KHR.nbufferImageHeight(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public Buffer imageSubresource(VkImageSubresourceLayers value) {
            VkBufferImageCopy2KHR.nimageSubresource(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public Buffer imageSubresource(Consumer<VkImageSubresourceLayers> consumer) {
            consumer.accept(imageSubresource());
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public Buffer imageOffset(VkOffset3D value) {
            VkBufferImageCopy2KHR.nimageOffset(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public Buffer imageOffset(Consumer<VkOffset3D> consumer) {
            consumer.accept(imageOffset());
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public Buffer imageExtent(VkExtent3D value) {
            VkBufferImageCopy2KHR.nimageExtent(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public Buffer imageExtent(Consumer<VkExtent3D> consumer) {
            consumer.accept(imageExtent());
            return this;
        }
    }
}
